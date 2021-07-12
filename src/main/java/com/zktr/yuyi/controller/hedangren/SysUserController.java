package com.zktr.yuyi.controller.hedangren;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.service.hedangren.SysUserRoleService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.util.MD5;
import com.zktr.yuyi.vo.AjaxResponse;
import com.zktr.yuyi.vo.UserVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
