package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
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
    @JsonFormat(pattern = "YYYY-MM-dd")
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


    private JdOldpeople jdOldpeople;

    private static final long serialVersionUID = 1L;
}