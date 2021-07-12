package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;

/**
 * (SysRoleMenu)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:21:13
 */
public class SysRoleMenu implements Serializable {
    private static final long serialVersionUID = -67656888203508552L;
    /**
     * 角色id
     */
    private Integer roleId;
    /**
     * 权限列表id
     */
    private Integer menuId;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}
