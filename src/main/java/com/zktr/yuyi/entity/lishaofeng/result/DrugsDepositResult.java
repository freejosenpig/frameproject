package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class DrugsDepositResult {
    /**
     * 药品缴存id
     */
    private Integer dd_Id;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 缴药方式
     */
    private String paymentmethod;

    /**
     * 药名
     药名
     药名
     */
    private String dgname;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 用药单位
     */
    private String munit;

    /**
     * 状态
     */
    private String status;

    /**
     * 登记人
     */
    private String rname;

    private Date creat_Time;
    private String oldpeople_Name;
}
