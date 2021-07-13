package com.zktr.yuyi.entity.liuzhui;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * service_nurse
 * @author 
 */
@Data
public class ServiceNurse implements Serializable {
    private Integer id;

    private String nName;

    private String nSex;

    private Integer nAge;

    private String nNation;

    private BigInteger nPhone;

    private BigInteger nCard;

    private String nAddress;

    private Integer nEphone;

    private String nWork;

    private String nType;

    private String nDept;

    private String nImg;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date nWorkDate;

    private Integer nMoney;

    private String nAnn;

    private String createPeople;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    private Integer teamId;

    private static final long serialVersionUID = 1L;
}