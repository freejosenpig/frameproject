package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import lombok.Data;

/**
 * a_roomtype
 * @author 
 */
@Data
public class ARoomtype implements Serializable {
    /**
     * 房间类型id
     */
    private Integer roomtypeId;

    /**
     * 房间类型名称
     */
    private String roomtypeName;

    /**
     * 房间类型价格
     */
    private Long roomtypePrice;

    private static final long serialVersionUID = 1L;
}