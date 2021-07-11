package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cost_type
 * @author 
 */
@Data
public class CostType implements Serializable {
    /**
     * 类别编号
     */
    private Integer typeId;

    /**
     * 类别名称
     */
    private String typeName;

    /**
     * 新增时间
     */
    private Date typeTime;

    /**
     * 新增人
     */
    private Integer typeOpid;

    /**
     * 时效性
     */
    private String typeTimeliness;

    private static final long serialVersionUID = 1L;
}