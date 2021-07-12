package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * serve_nurse_type
 * @author 
 */
@Data
public class NurseType implements Serializable {
    /**
     * 护理项目类别表
     */
    private Integer id;

    private String tName;

    private String tIntroduce;

    private Integer projectId;

    private String createPeople;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}