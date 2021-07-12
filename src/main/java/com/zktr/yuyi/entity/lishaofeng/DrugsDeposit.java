package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * drugs_deposit
 * @author 
 */

@Data
public class DrugsDeposit implements Serializable {
    /**
     * 药品缴存id
     */
    private Integer ddId;

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

    private Date creatTime;

    private static final long serialVersionUID = 1L;
}
