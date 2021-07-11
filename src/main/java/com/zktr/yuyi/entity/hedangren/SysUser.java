package com.zktr.yuyi.entity.hedangren;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

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

    private Date createDate;

    private Date updateDate;

    private static final long serialVersionUID = 1L;
}