package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * serve_nurse_level
 * @author 
 */
@Data
public class ServeNurseLevel implements Serializable {
    /**
     * 护理等级Id
     */
    private Integer id;

    private String lName;

    private String lType;

    private Integer lMoney;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lDate;

    /**
     * 护理级别说明
     */
    private String lExplain;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}