package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * medicine_dictionary
 * @author 
 */

@Data
public class MedicineDictionary implements Serializable {
    /**
     * 药物id
     */
    private Integer mdId;

    /**
     * 药物编号
     */
    private Integer drugcoding;

    /**
     * 药物类型
     */
    private String drugstype;

    /**
     * 药物名称
     */
    private String drugsname;

    /**
     * 最小规格
     */
    private Integer minimumspecification;

    /**
     * 类型
     */
    private String type;

    /**
     * 生产厂家
     */
    private String manufacturer;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
