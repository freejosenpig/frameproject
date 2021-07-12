package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;
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
    private Integer onOldid;

    /**
     * 入住时间
     */
    private Date onTime;

    /**
     * 入住档案创建人
     */
    private Integer onAddname;

    /**
     * 入住档案创建时间
     */
    private Date onAddtime;

    /**
     * 入住床位
     */
    private Integer onBed;

    /**
     * 入住档案登记人
     */
    private Integer onRegistrant;

    /**
     * 入住档案登记时间
     */
    private Date onRtime;

    /**
     * 入住经办人
     */
    private Integer onOperator;

    /**
     * 入住档案备注
     */
    private String onNote;

    private static final long serialVersionUID = 1L;
}