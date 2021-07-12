package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * serve_nurse_project
 * @author 
 */
@Data
public class ServeNurseProject implements Serializable {
    /**
     * 护理项目id
     */
    private Integer id;

    /**
     * 护理项目名称
     */
    private String planName;

    private String pType;

    private String pWay;

    private Integer pMonry;

    private Integer pTime;

    /**
     * 护理介绍
     */
    private String pIntroduce;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}