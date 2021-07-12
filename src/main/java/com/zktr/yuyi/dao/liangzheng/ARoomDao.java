package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.ARoom;

public interface ARoomDao {
    int deleteByPrimaryKey(Integer roomId);

    int insert(ARoom record);

    int insertSelective(ARoom record);

    ARoom selectByPrimaryKey(Integer roomId);

    int updateByPrimaryKeySelective(ARoom record);

    int updateByPrimaryKey(ARoom record);
}