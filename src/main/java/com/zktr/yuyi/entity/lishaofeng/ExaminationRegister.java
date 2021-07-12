package com.zktr.yuyi.entity.lishaofeng;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

/**
 * examination_register
 * @author 
 */

@Data
public class ExaminationRegister implements Serializable {
    /**
     * 体检id
     */
    private Integer erId;

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

    private Date createTime;

    private static final long serialVersionUID = 1L;
}
