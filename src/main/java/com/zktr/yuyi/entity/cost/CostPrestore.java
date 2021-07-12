package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cost_prestore
 * @author 
 */
@Data
public class CostPrestore implements Serializable {
    /**
     * 预存编号
     */
    private Integer prestoreId;

    /**
     * 老人编号
     */
    private Integer oldpeopleId;

    /**
     * 预存时间
     */
    private Date prestoreTime;

    /**
     * 预存金额
     */
    private Long prestoreMoney;

    /**
     * 预存操作人
     */
    private Integer prestoreOpid;

    /**
     * 时效性
     */
    private Integer prestoreTimeliness;

    private static final long serialVersionUID = 1L;
}