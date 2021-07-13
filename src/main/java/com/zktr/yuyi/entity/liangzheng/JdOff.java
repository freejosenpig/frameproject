package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import lombok.Data;

/**
 * jd_off
 * @author 
 */
@Data
public class JdOff implements Serializable {
    /**
     * 退住档案id
     */
    private Integer offId;

    /**
     * 退住结算单id
     */
    private Integer offBackid;

    /**
     * 退住档案创建人
     */
    private SysUser sysUser;
    private Integer offAddname;

    /**
     * 退住档案创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date offAddtime;

    /**
     * 退住档案登记人
     */
    private ServiceNurse serviceNurse;
    private Integer offRegistrant;

    /**
     * 退住档案登记时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date offRtime;

    /**
     * 老人档案id
     */
    private JdOldpeople jdOldpeople;
    private Integer offOrdid;

    /**
     * 退住原因
     */
    private String offReason;

    /**
     * 退住档案备注
     */
    private String offNote;

    /**
     * 退住时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date offTime;

    /**
     * 退住经办人
     */
    private ServiceNurse serviceNurse2;
    private Integer offoperator;

    /**
     * 退住经办时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date offoptime;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}