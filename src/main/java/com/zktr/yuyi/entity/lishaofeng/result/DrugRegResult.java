package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;

@Data
public class DrugRegResult {
    /**
     * 用药登记id
     */
    private Integer msg_Id;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 用药时间
     */
    private Date mtime;

    /**
     * 登记时间
     */
    private Date rtime;

    /**
     * 药品类别
     */
    private String drugstype;

    /**
     * 创建时间
     */
    private Date create_Time;
    private String oldpeople_Name;
}
