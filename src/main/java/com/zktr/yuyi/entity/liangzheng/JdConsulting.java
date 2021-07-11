package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * jd_consulting
 * @author 
 */
@Data
public class JdConsulting implements Serializable {
    /**
     * 咨询档案id
     */
    private Integer consultingId;

    /**
     * 咨询人姓名
     */
    private String consultingName;

    /**
     * 咨询时间
     */
    private Date consultingTime;

    /**
     * 咨询方式
     */
    private String consultingWay;

    /**
     * 咨询内容
     */
    private String consultingContent;

    /**
     * 咨询类型
     */
    private String consultingType;

    /**
     * 咨询人联系电话
     */
    private String consultingPhone;

    /**
     * 咨询人与老人关系
     */
    private String consultingRelation;

    /**
     * 老人姓名
     */
    private String consultingOldname;

    /**
     * 老人身份证号
     */
    private String consultingOldidcard;

    /**
     * 老人性别
     */
    private String consultingOldsex;

    /**
     * 老人年龄
     */
    private Integer consultingOldage;

    /**
     * 老人自理状况
     */
    private String consultingSelfcare;

    /**
     * 老人家庭住址
     */
    private String consultingOrdaddress;

    /**
     * 接待人
     */
    private Integer consultingService;

    /**
     * 咨询档案创建人
     */
    private Integer consultingAddname;

    /**
     * 咨询档案创建时间
     */
    private Date consultingAddtime;

    /**
     * 咨询档案登记人
     */
    private Integer consultingRegistrant;

    /**
     * 咨询档案登记时间
     */
    private Date consultingRtime;

    /**
     * 咨询档案备注
     */
    private String consultingNote;

    private static final long serialVersionUID = 1L;
}