package com.zktr.yuyi.entity.cost;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
/**
 * cost_entryfees
 * @author 
 */
@Data
public class CostEntryfees implements Serializable {
    /**
     * 缴费编号
     */
    private Integer entryfeesId;

    /**
     * 老人编号
     */
    private Integer oldpeopleId;

    /**
     * 缴费金额
     */
    private Long entryfeesMoney;

    /**
     * 缴费说明
     */
    private String entryfeesExplain;

    /**
     * 缴费时间
     */
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date entryfeesTime;

    /**
     * 收费人
     */
    private Integer entryfeesOpid;

    /**
     * 时效性
     */
    private Integer entryfeesTimeliness;

    private static final long serialVersionUID = 1L;
}