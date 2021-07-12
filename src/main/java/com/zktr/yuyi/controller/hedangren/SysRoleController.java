package com.zktr.yuyi.controller.hedangren;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysRole;
import com.zktr.yuyi.entity.hedangren.SysRoleMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.service.hedangren.SysRoleService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * (SysRole)表控制层
 *
 * @author hdr666
 * @since 2021-07-12 08:16:10
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;
    @Resource
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRole selectOne(Integer id) {
        return this.sysRoleService.queryById(id);
    }

    /**
     * 用户管理 查询用户所有的角色
     * @return 菜单信息
     */
    @PostMapping("/findallroles")
    public AjaxResponse findallroles(){
        //查询所有角色
        List<SysRole> allroles=sysRoleService.queryAll();
        return AjaxResponse.success(allroles);
    }

    /**
     * 条件分页查询角色信息
     * @param conditionpage 查询条件
     * @return 菜单信息
     */
    @PostMapping("/conditionpagerole")
    public AjaxResponse conditionpagerole(@RequestBody String conditionpage){
        JSONObject jsonObject = JSONObject.parseObject(conditionpage);
        String condition = jsonObject.getString("condition");//查询条件
        SysRole role = JSON.parseObject(condition, SysRole.class);
        int currentPage = Integer.parseInt(jsonObject.getString("currentPage"));
        int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));
        Map<String,Object> map=new HashMap<>();
        Page<Object> page= PageHelper.startPage(currentPage,pageSize);
        List<SysRole> users=sysRoleService.queryAllByCondition(role);
        map.put("total",page.getTotal());
        map.put("rows",users);
        return AjaxResponse.success(map);
    }

    /**
     * 角色管理 添加角色
     * @param add json对象
     * @return vo
     */
    @PostMapping("/addnewrole")
    public AjaxResponse addnewrole(@RequestBody String add){
        JSONObject jsonObject = JSONObject.parseObject(add);
        String menus = jsonObject.getString("menus");//菜单
        List<SysMenu> sysMenu= JSONArray.parseArray(menus, SysMenu.class);
        String roles = jsonObject.getString("roles");//角色
        SysRole sysRole = JSON.parseObject(roles, SysRole.class);
        SysUser user = sysUserService.login(sysRole.getCreatePeople());
        sysRole.setCreatePeople(user.getId()+"");
        sysRole.setCreateDate(new Date());
        sysRole.setDeleteFlag(0);
        //新增角色
        sysRoleService.insert(sysRole);
        //新增角色菜单
        List<SysRoleMenu> lists=new ArrayList<>();
        for (int i=0;i<sysMenu.size();i++){
            SysRoleMenu sysRoleMenu=new SysRoleMenu();
            sysRoleMenu.setRoleId(sysRole.getId());
            sysRoleMenu.setMenuId(sysMenu.get(i).getId());
            lists.add(sysRoleMenu);
        }
        return AjaxResponse.success(sysRoleService.insertBatch(lists));
    }



}
