package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * cost_outstanding
 * @author 
 */
@Data
public class CostOutstanding implements Serializable {
    /**
     * 欠费编号
     */
    private Integer outstandingId;

    /**
     * 老人编号
     */
    private Integer oldpeopleId;

    /**
     * 欠费金额
     */
    private Long outstandingMoney;

    /**
     * 预存金额
     */
    private Long outPrestoreMoney;

    /**
     * 缴费金额
     */
    private Long outEntryfeesMoney;

    /**
     * 欠费补缴操作人
     */
    private Integer outstandingOpid;

    /**
     * 欠费补缴时间
     */
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date outstandingTime;

    /**
     * 时效性
     */
    private Integer outstandingTimeliness;

    private static final long serialVersionUID = 1L;
}