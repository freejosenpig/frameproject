package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import lombok.Data;

/**
 * jd_family
 * @author 
 */
@Data
public class JdFamily implements Serializable {
    /**
     * 家属档案id
     */
    private Integer familyId;

    /**
     * 家属姓名
     */
    private String familyName;

    /**
     * 家属联系姓名
     */
    private String familyPhone;

    /**
     * 家属联系地址
     */
    private String familyAddress;

    /**
     * 家属老人
     */
    private JdOldpeople jdOldpeople;
    private Integer familyOrdid;

    /**
     * 家属与老人关系
     */
    private String familyRelation;

    /**
     * 家属档案创建人
     */
    private SysUser sysUser;
    private Integer familyAddname;

    /**
     * 家属档案创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date familyAddtime;

    /**
     * 家属档案登记人
     */
    private ServiceNurse serviceNurse;
    private Integer familyRegistrant;

    /**
     * 家属档案登记时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date familyRtime;

    /**
     * 家属档案备注
     */
    private String familyNote;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}