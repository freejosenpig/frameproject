package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.entity.liangzheng.JdOn;
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
    //老人信息
    private JdOldpeople jdOldpeople;

    /**
     * 入住信息
     */
    private JdOn jdOn;
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
    @JsonFormat(pattern = "YYYY-MM-dd")
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