package com.zktr.yuyi.entity.hedangren;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysRole)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:20:52
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = -30511665931810953L;

    private Integer id;

    private String roleName;

    private Integer createPeople;

    private Date createDate;

    private Integer deleteFlag;

    private Integer updatePeople;

    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(Integer createPeople) {
        this.createPeople = createPeople;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getUpdatePeople() {
        return updatePeople;
    }

    public void setUpdatePeople(Integer updatePeople) {
        this.updatePeople = updatePeople;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
