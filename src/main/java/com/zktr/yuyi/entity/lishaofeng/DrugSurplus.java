package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * drug_surplus
 * @author 
 */

@Data
public class DrugSurplus implements Serializable {
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

    private static final long serialVersionUID = 1L;
}
