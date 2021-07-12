package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * sys_user
 * @author 
 */
@Data
public class SysUser implements Serializable {

    private Integer id;

    private String userName;

    private String userPass;

    private String userIcon;

    private String userPhone;

    private String userSex;

    private Integer userState;

    private Integer userFlag;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    private static final long serialVersionUID = 1L;
}