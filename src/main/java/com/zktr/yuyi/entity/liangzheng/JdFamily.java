package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;
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
    private Integer familyOrdid;

    /**
     * 家属与老人关系
     */
    private String familyRelation;

    /**
     * 家属档案创建人
     */
    private Integer familyAddname;

    /**
     * 家属档案创建时间
     */
    private Date familyAddtime;

    /**
     * 家属档案登记人
     */
    private Integer familyRegistrant;

    /**
     * 家属档案登记时间
     */
    private Date familyRtime;

    /**
     * 家属档案备注
     */
    private String familyNote;

    private static final long serialVersionUID = 1L;
}