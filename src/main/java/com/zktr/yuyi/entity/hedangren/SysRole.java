package com.zktr.yuyi.entity.hedangren;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysRole)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:20:52
 */
@Data
public class SysRole implements Serializable {
    private static final long serialVersionUID = -30511665931810953L;

    private Integer id;

    private String roleName;

    private String createPeople;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    private Integer deleteFlag;

    private String updatePeople;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;


}
