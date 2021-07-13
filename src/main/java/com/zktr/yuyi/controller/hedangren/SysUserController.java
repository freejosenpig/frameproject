package com.zktr.yuyi.controller.hedangren;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysRole;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.hedangren.SysUserRole;
import com.zktr.yuyi.service.hedangren.SysRoleService;
import com.zktr.yuyi.service.hedangren.SysUserRoleService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.vo.AjaxResponse;
import com.zktr.yuyi.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * (SysUser)表控制层
 *
 * @author hdr666
 * @since 2021-07-11 15:26:30
 */
@RestController
@RequestMapping("sysUser")
@EnableSwagger2
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysUserRoleService sysUserRoleService;
    @Resource
    private SysRoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Integer id) {
        return this.sysUserService.queryById(id);
    }


    @PostMapping("/login")
    @ApiOperation(value = "用户账户登录",produces = "application/json")
    public AjaxResponse login(@RequestBody SysUser user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        SysUser loginuser = sysUserService.login(user.getUserName());
        System.out.println(user);
        System.out.println(loginuser);
        if (loginuser == null) {
            return AjaxResponse.success("账户不存在");
        } else {
            if(user.getUserPass().equals(loginuser.getUserPass())){
                List<SysMenu> menus = sysUserService.usermenu(loginuser.getId());
                //获取父菜单
                List<SysMenu> treemenu = menus.stream().filter(m -> m.getParentId() == 0).map(
                        (m) -> {
                            m.setChildMenu(getChildrens(m, menus));
                            return m;
                        }
                ).collect(Collectors.toList());
                UserVo vo = new UserVo();
                vo.setUser(loginuser);
                vo.setMenus(treemenu);
                vo.setValidate(true);
                return  AjaxResponse.success(vo);
            }else {
                return AjaxResponse.success("密码错误");
            }
        }

    }

    /**
     * 条件分页查询用户信息
     * @param conditionpage 查询条件
     * @return 菜单信息
     */
    @PostMapping("/conditionpageuser")
    public AjaxResponse conditionpageuser(@RequestBody String conditionpage){
        JSONObject jsonObject = JSONObject.parseObject(conditionpage);
        String condition = jsonObject.getString("condition");//查询条件
        SysUser user = JSON.parseObject(condition, SysUser.class);
        int currentPage = Integer.parseInt(jsonObject.getString("currentPage"));
        int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));
        Map<String,Object> map=new HashMap<>();
        Page<Object> page= PageHelper.startPage(currentPage,pageSize);
        List<SysUser> users=sysUserService.queryAllByUser(user);
        map.put("total",page.getTotal());
        map.put("rows",users);
        return AjaxResponse.success(map);
    }


    /**
     * 用户管理 修改用户数据
     * @param change json对象
     * @return 是否成功
     */
    @PostMapping("/changeuesr")
    public AjaxResponse changeuesr(@RequestBody String change) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        JSONObject jsonObject = JSONObject.parseObject(change);
        String one = jsonObject.getString("user");//用户
        SysUser user=JSON.parseObject(one, SysUser.class);
        String roles = jsonObject.getString("roles");//角色
        List<SysRole> sysRole = JSONArray.parseArray(roles, SysRole.class);
        user.setUpdateDate(new Date());
        System.out.println(user);
        //修改用户
        if(sysRole.size()==0){
            return AjaxResponse.success(sysUserService.update(user));
        }else {
            //修改用户角色
            sysUserService.deleteroles(user.getId());//先删除原有的数据
            List<SysUserRole> lists=new ArrayList<>();
            for (int i=0;i<sysRole.size();i++){
                SysUserRole sysUserRole=new SysUserRole();
                sysUserRole.setUserId(user.getId());
                sysUserRole.setRoleId(sysRole.get(i).getId());
                lists.add(sysUserRole);
            }
            sysUserService.insertBatch(lists);
            return AjaxResponse.success(sysUserService.update(user));
        }
    }


    /**
     * 用户管理 查询某个用户所具有的角色
     * @return 菜单信息
     */
    @PostMapping("/findroles")
    public AjaxResponse findroles(String username){
        SysUser loginuser = sysUserService.login(username);
        //查询用户具有的角色
        List<SysRole> roles=roleService.userhasrole(loginuser.getId());
        return AjaxResponse.success(roles);
    }


    /**
     * 用户管理 添加用户
     * @param add json对象
     * @return vo
     */
    //@Log("添加用户")
    @PostMapping("/addnewuser")
    public AjaxResponse addnewuser(@RequestBody String add) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        JSONObject jsonObject = JSONObject.parseObject(add);
        String one = jsonObject.getString("user");//用户
        SysUser user=JSON.parseObject(one, SysUser.class);
        String roles = jsonObject.getString("roles");//角色
        List<SysRole> sysRole = JSONArray.parseArray(roles, SysRole.class);
        user.setCreateDate(new Date());
        user.setUserFlag(0);
        int maxid = sysUserService.selectmaxid();
        user.setId(maxid+1);
        //新增用户
        sysUserService.insert(user);

        List<SysUserRole> lists=new ArrayList<>();
        for (int i=0;i<sysRole.size();i++){
            SysUserRole sysUserRole=new SysUserRole();
            sysUserRole.setUserId(user.getId());
            sysUserRole.setRoleId(sysRole.get(i).getId());
            lists.add(sysUserRole);
        }
        return AjaxResponse.success(sysUserService.insertBatch(lists));
    }





    /**
     * 递归查询子菜单
     * @param root 根菜单
     * @param all  所有菜单
     * @return 菜单信息
     */
    public List<SysMenu> getChildrens(SysMenu root, List<SysMenu> all) {
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
