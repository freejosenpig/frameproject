package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * jd_oldpeople
 * @author 
 */
@Data
public class JdOldpeople implements Serializable {
    /**
     * 老人档案id
     */
    private Integer oldpeopleId;

    /**
     * 姓名
     */
    private String oldpeopleName;

    /**
     * 性别
     */
    private String oldpeopleSex;

    /**
     * 身份证号
     */
    private String oldpeopleIdcard;

    /**
     * 生日
     */
    private Date oldpeopleBirthday;

    /**
     * 联系电话
     */
    private String oldpeoplePhone;

    /**
     * 婚姻状况
     */
    private String oldpeopleMarriage;

    /**
     * 民族
     */
    private String oldpeopleNational;

    /**
     * 政治面貌
     */
    private String oldpeoplePolitical;

    /**
     * 退休职业
     */
    private String oldpeopleJob;

    /**
     * 家庭住址
     */
    private String oldpeopleAddress;

    /**
     * 爱好
     */
    private String oldpeopleHobby;

    /**
     * 性格心理
     */
    private String oldpeopleCharacter;

    /**
     * 饮食特点
     */
    private String oldpeopleLikefood;

    /**
     * 文化程度
     */
    private String oldpeopleCulture;

    /**
     * 劳动能力
     */
    private String oldpeopleAbility;

    /**
     * 医疗保障
     */
    private String oldpeopleMedical;

    /**
     * 医疗卡号
     */
    private String oldpeopleMedicalid;

    /**
     * 老人档案编号
     */
    private String oldpeopleNumber;

    /**
     * 老人档案创建人
     */
    private Integer oldpeopleAddname;

    /**
     * 老人档案创建时间
     */
    private Date oldpeopleAddtime;

    /**
     * 预存账户
     */
    private Long oldpeopleAccount;

    /**
     * 年龄
     */
    private Integer oldpeopleAge;

    /**
     * 是否在住
     */
    private Integer oldpeopleStatus;

    /**
     * 老人档案登记人
     */
    private Integer oldpeopleRegistrant;

    /**
     * 老人档案登记时间
     */
    private Date oldpeopleRtime;

    /**
     * 老人档案备注
     */
    private String oldpeopleNote;

    /**
     * 时效性
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}