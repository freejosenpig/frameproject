package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * cost_typedetails
 * @author 
 */
@Data
public class CostTypedetails implements Serializable {
    /**
     * 费用详情编号
     */
    private Integer itemId;

    /**
     * 类别编号
     */
    private Integer typeId;

    /**
     * 费用详情名称
     */
    private String itemNameId;


    /**
     * 说明
     */
    private String itemExplain;

    /**
     * 操作人编号
     */
    private Integer itemOpid;

    /**
     * 操作时间
     */
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date itemTime;

    /**
     * 时效性
     */
    private String itemTimeliness;

    private CostType costType;

    private static final long serialVersionUID = 1L;
}