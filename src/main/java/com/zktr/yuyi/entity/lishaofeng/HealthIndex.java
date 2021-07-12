package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * health_index
 * @author 
 */

@Data
public class HealthIndex implements Serializable {
    /**
     * 健康指数id
     */
    private Integer hrId;

    /**
     * 老人id
     */
    private Integer id;

    /**
     * 体检时间
     */
    private Date etime;

    /**
     * 体重
     */
    private Long weight;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 左眼视力
     */
    private Long lefteyeVisual;

    /**
     * 右眼视力
     */
    private Long righteyeVisual;

    /**
     * 听力
     */
    private Long listen;

    /**
     * 心率
     */
    private Integer heartrate;

    /**
     * 血压
     */
    private Long bloodpressure;

    /**
     * 血脂
     */
    private Long bloodfat;

    /**
     * 睡眠时间
     */
    private Integer sleeptime;

    /**
     * 血糖
     */
    private Long bloodsugar;

    /**
     * 体脂率
     */
    private Long bodyfat;

    /**
     * 血红蛋白
     */
    private Integer hemoglobin;

    /**
     * 肺活量
     */
    private Integer vitalcapacity;

    /**
     * 尿酸
     */
    private Integer uricacid;

    /**
     * 体检日期
     */
    private Date examinationdate;

    /**
     * 数据来源
     */
    private String datasources;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
