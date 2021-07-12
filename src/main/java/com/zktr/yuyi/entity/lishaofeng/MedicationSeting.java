package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * medication_seting
 * @author 
 */

@Data
public class MedicationSeting implements Serializable {
    /**
     * 用药设置id
     */
    private Integer msId;

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

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
