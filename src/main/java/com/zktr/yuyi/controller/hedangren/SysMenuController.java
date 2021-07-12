package com.zktr.yuyi.controller.hedangren;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.service.hedangren.SysMenuService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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
