package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * cost_list
 * @author 
 */
@Data
public class CostList implements Serializable {
    /**
     * 费用流水编号
     */
    private Integer listId;

    /**
     * 老人编号
     */
    private Integer oldpeopleId;

    /**
     * 流水说明
     */
    private String listExplain;

    /**
     * 流水金额
     */
    private Long listMoeny;

    /**
     * 消费时间
     */
    private Date listTime;

    /**
     * 新增人
     */
    private Integer liatOpid;

    /**
     * 说明
     */
    private String listRemark;

    /**
     * 时效性
     */
    private  int timeLiness;


    private static final long serialVersionUID = 1L;
}