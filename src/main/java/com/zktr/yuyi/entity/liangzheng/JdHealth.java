package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * jd_health
 * @author 
 */
@Data
public class JdHealth implements Serializable {
    /**
     * 健康评估档案id
     */
    private Integer healthId;

    /**
     * 健康评估对象
     */
    private Integer healthOrdid;

    /**
     * 健康评估人
     */
    private Integer healthEvaluator;

    /**
     * 健康评估结果
     */
    private String healthResult;

    /**
     * 老人主要疾病
     */
    private String healthDisease;

    /**
     * 老人健康状态
     */
    private Integer healthStatus;

    /**
     * 健康评估档案创建人
     */
    private Integer healthAddname;

    /**
     * 健康评估档案创建时间
     */
    private Date healthAddtime;

    /**
     * 健康评估档案登记人
     */
    private Integer healthRegistrant;

    /**
     * 健康档案登记时间
     */
    private Date healthRtime;

    /**
     * 健康档案备注
     */
    private String healthNote;

    private static final long serialVersionUID = 1L;
}