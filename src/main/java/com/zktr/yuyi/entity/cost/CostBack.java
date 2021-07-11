package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cost_back
 * @author 
 */
@Data
public class CostBack implements Serializable {
    /**
     * 退住编号
     */
    private Integer backId;

    /**
     * 老人编号
     */
    private Integer oldpeopleId;

    private Integer istoback;

    /**
     * 退住金额
     */
    private Long backMoney;

    /**
     * 应缴金额
     */
    private Long backEntryfeesMoney;

    /**
     * 退住操作人
     */
    private Integer backOpid;

    /**
     * 退住时间
     */
    private Date backTime;

    /**
     * 应收
     */
    private Long entryMoney;

    /**
     * 应退
     */
    private Long outMoney;

    /**
     * 时效性
     */
    private Integer backTimeliness;

    private static final long serialVersionUID = 1L;
}