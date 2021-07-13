package com.zktr.yuyi.controller.hedangren;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysRole;
import com.zktr.yuyi.entity.hedangren.SysRoleMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.service.hedangren.SysMenuService;
import com.zktr.yuyi.service.hedangren.SysRoleService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.vo.AjaxResponse;
import com.zktr.yuyi.vo.SystemRoleMenuVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * (SysMenu)表控制层
 *
 * @author hdr666
 * @since 2021-07-12 11:25:58
 */
@RestController
@RequestMapping("sysMenu")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenuService sysMenuService;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenu selectOne(Integer id) {
        return this.sysMenuService.queryById(id);
    }

    /**
     * 菜单管理查询所有菜单
     * @return 菜单信息
     */
    @PostMapping("/findmenulist")
    public AjaxResponse findmenulist(){
        List<SysMenu> menulist=sysMenuService.usermenu(0);
        List<SysMenu> treemenu = menulist.stream().filter(m -> m.getParentId() == 0).map(
                (m) -> {
                    m.setChildMenu(getChildrens(m, menulist));
                    return m;
                }
        ).collect(Collectors.toList());
        return AjaxResponse.success(treemenu);
    }

    /**
     * 通过菜单实体类修改菜单
     * @param sysMenu 菜单
     * @param username  用户名
     * @return 菜单信息
     */
    @PostMapping("/changemenu/{username}")
    public AjaxResponse change(@RequestBody SysMenu sysMenu, @PathVariable("username")String username){
        boolean tf=sysMenuService.update(sysMenu);
        if(tf==false){
            return AjaxResponse.success(false);
        }else {
            SysUser loginuser = sysUserService.login(username);
            System.out.println(loginuser);
            List<SysMenu> usermenu = sysMenuService.queryUserMenu(loginuser.getId());
            //获取父菜单
            List<SysMenu> treemenu = usermenu.stream().filter(m -> m.getParentId() == 0).map(
                    (m) -> {
                        m.setChildMenu(getChildrens(m, usermenu));
                        return m;
                    }
            ).collect(Collectors.toList());
            return AjaxResponse.success(treemenu);
        }
    }


    /**
     * 角色管理 通过实体类修改角色菜单
     * @param change  json对象
     * @return vo
     */
    @PostMapping("/changerolemenu")
    public AjaxResponse changerolemenu(@RequestBody String change){
        JSONObject jsonObject = JSONObject.parseObject(change);
        String menus = jsonObject.getString("menus");//菜单
        List<SysMenu> sysMenu= JSONArray.parseArray(menus, SysMenu.class);
        String roles = jsonObject.getString("roles");//角色
        SysRole sysRole = JSON.parseObject(roles, SysRole.class);
        String userName = JSON.parseObject(jsonObject.getString("userName"), String.class) ;//用户名
        System.out.println(userName);
        SysUser user = sysUserService.login(userName);
        System.out.println(user);
        sysRole.setUpdatePeople(user.getId().toString());
        sysRole.setUpdateDate(new Date());
        //判断是否为删除
        if(sysRole.getDeleteFlag()!=null && sysRoleService.findtfhasuser(sysRole.getId()).size()==0){//判断角色新是否存在用户
            return AjaxResponse.success(sysRoleService.update(sysRole));
        }
        if (sysRole.getDeleteFlag()!=null && sysRoleService.findtfhasuser(sysRole.getId()).size()>0){
            return AjaxResponse.success(false);
        }
        //判断菜单数据是否被修改
        if (sysMenu.size()==0 ){
            return AjaxResponse.success(sysRoleService.update(sysRole));
        }else {
            sysRoleService.deletemenus(sysRole.getId());//先删除原有的数据
            List<SysRoleMenu> lists=new ArrayList<>();
            for (int i=0;i<sysMenu.size();i++){
                SysRoleMenu sysRoleMenu=new SysRoleMenu();
                sysRoleMenu.setRoleId(sysRole.getId());
                sysRoleMenu.setMenuId(sysMenu.get(i).getId());
                lists.add(sysRoleMenu);
            }
            sysRoleService.insertBatch(lists);
        }
        return AjaxResponse.success(sysRoleService.update(sysRole));
    }


    /**
     * 角色管理 查询角色所有的菜单及某个角色所具有菜单
     * @param roleId  角色id
     * @return vo
     */
    @PostMapping("/findmenus")
    public AjaxResponse findmenus(Integer roleId){
        System.out.println(roleId);
        SystemRoleMenuVo vo=new SystemRoleMenuVo();
        //查询角色独有菜单
        List<SysMenu> usermenu = sysMenuService.rolemenu(roleId);
        //查询所有菜单
        List<SysMenu> menulist=sysMenuService.rolemenu(0);
        List<SysMenu> allmenu = menulist.stream().filter(m -> m.getParentId() == 0).map(
                (m) -> {
                    m.setChildMenu(getChildrens(m, menulist));
                    return m;
                }
        ).collect(Collectors.toList());
        vo.setAllmenus(allmenu);
        vo.setMenus(usermenu);
        return AjaxResponse.success(vo);
    }



    /**
     * 递归查询子菜单
     * @param root 根菜单
     * @param all  所有菜单
     * @return 菜单信息
     */
    private List<SysMenu> getChildrens(SysMenu root, List<SysMenu> all) {
        List<SysMenu> children = all.stream().filter(m -> {
            return Objects.equals(m.getParentId(), root.getId());
        }).map(
                (m) -> {
                    m.setChildMenu(getChildrens(m, all));
                    return m;
                }
        ).collect(Collectors.toList());
        return children;
    }

}
