package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;

/**
 * (SysUserRole)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:21:42
 */
public class SysUserRole implements Serializable {
    private static final long serialVersionUID = 894724481358021472L;

    private Integer userId;

    private Integer roleId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
