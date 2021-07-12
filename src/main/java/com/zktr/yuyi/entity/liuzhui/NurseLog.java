package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * serve_nurse_log
 * @author 
 */
@Data
public class NurseLog implements Serializable {
    /**
     * 护理记录id
     */
    private Integer id;

    private Date rTime;

    private String rName;

    private Integer rNumber;

    private String rTeam;

    private String rPeople;

    /**
     * 完成情况
     */
    private String rFinish;

    /**
     * 休息
     */
    private String rRest;

    /**
     * 服药
     */
    private String rMedicine;

    /**
     * 活动
     */
    private String rActivity;

    /**
     * 注意事项
     */
    private String rAnn;

    /**
     * 护工id
     */
    private Integer nurseId;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}