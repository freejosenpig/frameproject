package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class ExaminationRegistResult {
    /**
     * 体检id
     */
    private Integer er_Id;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 体检医院
     */
    private String hospital;

    /**
     * 体检时间
     */
    private Date etime;

    /**
     * 体检结果
     */
    private String eresult;

    /**
     * 登记人id
     */
    private Integer registrant;

    /**
     * 登记时间
     */
    private Date rgtime;

    private Date create_time;
    private String oldpeople_name;
}
