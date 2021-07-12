package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * serve_nurse_team
 * @author 
 */
@Data
public class NurseTeam implements Serializable {
    /**
     * 护理小组表
     */
    private Integer id;

    private String tName;

    private String tPeople;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}