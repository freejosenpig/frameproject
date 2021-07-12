package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class DrugSuplusResult {
    /**
     * 药物剩余id
     */
    private Integer mesId;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 药名
     */
    private String mname;

    /**
     * 最小规模
     */
    private String minimumSize;

    /**
     * 剩余药品
     */
    private Integer surplusmedine;

    /**
     * 药品结余状态
     */
    private String balancestatus;

    /**
     * 创建时间
     */
    private Date createTime;
    private String oldpeopleName;
}
