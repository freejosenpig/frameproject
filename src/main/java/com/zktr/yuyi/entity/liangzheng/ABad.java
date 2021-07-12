package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import lombok.Data;

/**
 * a_bad
 * @author 
 */
@Data
public class ABad implements Serializable {
    /**
     * 床位id
     */
    private Integer bedId;

    /**
     * 床位编号
     */
    private String bedNumber;

    /**
     * 床位所在房间
     */
    private ARoom room;
    private ARoomtype roomtype;
    private Integer bedRoom;

    /**
     * 床位状态
     */
    private Integer bedStatus;

    private static final long serialVersionUID = 1L;
}