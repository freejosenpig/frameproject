package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;

/**
 * (SysDepartmentUser)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:23:08
 */
public class SysDepartmentUser implements Serializable {
    private static final long serialVersionUID = -25236217135347364L;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 部门id
     */
    private Integer departmentId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}
