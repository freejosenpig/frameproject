package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;

/**
 * (SysDepartmentMenu)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:22:45
 */
public class SysDepartmentMenu implements Serializable {
    private static final long serialVersionUID = -10597694227575685L;
    /**
     * 权限菜单id
     */
    private String menuId;
    /**
     * 部门id
     */
    private String departemntId;


    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getDepartemntId() {
        return departemntId;
    }

    public void setDepartemntId(String departemntId) {
        this.departemntId = departemntId;
    }

}
