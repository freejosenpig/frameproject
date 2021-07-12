package com.zktr.yuyi.entity.lishaofeng.result;

import lombok.Data;

import java.util.Date;
@Data
public class MedicalRegisterResult {
    /**
     * 就医登记id
     */
    private Integer mrId;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 就医时间
     */
    private Date medicalTime;

    /**
     * 就医地点
     */
    private String medicalAdress;

    /**
     * 医生
     */
    private String doctor;

    /**
     * 诊断结果
     */
    private String diagnosisResults;

    /**
     * 医嘱
     */
    private String medicalAdvice;

    /**
     * 登记时间
     */
    private Date rgtime;

    private Date creatTime;
    private String oldpeopleName;
}
