package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
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
    private JdOldpeople jdOldpeople;
    private Integer healthOrdid;

    /**
     * 健康评估人
     */
    private ServiceNurse serviceNurse2;
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
    private SysUser sysUser;
    private Integer healthAddname;

    /**
     * 健康评估档案创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date healthAddtime;

    /**
     * 健康评估档案登记人
     */
    private ServiceNurse serviceNurse;
    private Integer healthRegistrant;

    /**
     * 健康档案登记时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date healthRtime;

    /**
     * 健康档案备注
     */
    private String healthNote;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}