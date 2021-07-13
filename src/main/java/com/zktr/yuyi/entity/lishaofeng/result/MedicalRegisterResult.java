package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class MedicalRegisterResult {
    /**
     * 就医登记id
     */
    private Integer mr_Id;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 就医时间
     */
    private Date medical_Time;

    /**
     * 就医地点
     */
    private String medical_Adress;

    /**
     * 医生
     */
    private String doctor;

    /**
     * 诊断结果
     */
    private String diagnosis_Results;

    /**
     * 医嘱
     */
    private String medical_Advice;

    /**
     * 登记时间
     */
    private Date rgtime;

    private Date creat_Time;
    private String oldpeople_Name;
}
