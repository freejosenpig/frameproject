package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import lombok.Data;

/**
 * jd_on
 * @author 
 */
@Data
public class JdOn implements Serializable {
    /**
     * 入住档案id
     */
    private Integer onId;

    /**
     * 入住老人id
     */
    private JdOldpeople jdOldpeople;
    private Integer onOldid;

    /**
     * 入住时间
     */
    private Date onTime;

    /**
     * 入住档案创建人
     */
    private SysUser sysUser;
    private Integer onAddname;

    /**
     * 入住档案创建时间
     */
    private Date onAddtime;

    /**
     * 入住床位
     */
    private ABad bad;
    private ARoom room;
    private Integer onBed;

    /**
     * 入住档案登记人
     */
    private ServiceNurse serviceNurse;
    private Integer onRegistrant;

    /**
     * 入住档案登记时间
     */
    private Date onRtime;

    /**
     * 入住经办人
     */
    private ServiceNurse serviceNurse2;
    private Integer onOperator;

    /**
     * 经办时间
     */
    private Date onOptime;

    /**
     * 入住档案备注
     */
    private String onNote;

    /**
     * 入住应付金额
     */
    private Long onmoney;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}