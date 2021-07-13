package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class MedicationSetingsResult {
    /**
     * 用药设置id
     */
    private Integer ms_Id;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 疾病
     */
    private String disease;

    /**
     * 疾病类型
     */
    private String diseasetype;

    private Date create_Time;

    private static final long serialVersionUID = 1L;
    private String oldpeople_Name;
}
