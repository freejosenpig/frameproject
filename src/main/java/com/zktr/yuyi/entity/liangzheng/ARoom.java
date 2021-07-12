package com.zktr.yuyi.entity.liangzheng;

import java.io.Serializable;
import lombok.Data;

/**
 * a_room
 * @author 
 */
@Data
public class ARoom implements Serializable {
    /**
     * 房间id
     */
    private Integer roomId;

    /**
     * 房间编号
     */
    private String roomNumber;

    /**
     * 房间类型
     */
    private Integer roomType;

    /**
     * 房间所在楼层
     */
    private Integer roomFloor;

    /**
     * 房间所在建筑
     */
    private String roomBuilding;

    /**
     * 房间状态
     */
    private Integer roomStatus;

    private static final long serialVersionUID = 1L;
}