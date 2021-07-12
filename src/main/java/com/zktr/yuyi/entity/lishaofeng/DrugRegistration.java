package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * drug_registration
 * @author 
 */

@Data
public class DrugRegistration implements Serializable {
    /**
     * 用药登记id
     */
    private Integer msgId;

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
    private Date createTime;

    private static final long serialVersionUID = 1L;
}
