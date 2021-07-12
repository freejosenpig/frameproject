package com.zktr.yuyi.entity.hedangren;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysDepartment)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:22:33
 */
public class SysDepartment implements Serializable {
    private static final long serialVersionUID = 592477453023184854L;
    /**
     * 部门id
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门创建人
     */
    private Integer createPeople;
    /**
     * 部门创建时间
     */
    private Date createDate;
    /**
     * 删除状态
     */
    private Integer deleteFlag;
    /**
     * 部门修改人
     */
    private Integer updatePeople;
    /**
     * 部门修改时间
     */
    private Date updateDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
