package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * serve_nurse_plan
 * @author 
 */
@Data
public class NursePlan implements Serializable {
    /**
     * 护理计划Id
     */
    private Integer id;

    private String planName;

    private String planType;

    private Integer planMoney;

    private Integer planWay;

    private Integer planHz;

    private Date planTime;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}