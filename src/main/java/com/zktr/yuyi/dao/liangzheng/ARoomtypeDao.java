package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.ARoomtype;

public interface ARoomtypeDao {
    int deleteByPrimaryKey(Integer roomtypeId);

    int insert(ARoomtype record);

    int insertSelective(ARoomtype record);

    ARoomtype selectByPrimaryKey(Integer roomtypeId);

    int updateByPrimaryKeySelective(ARoomtype record);

    int updateByPrimaryKey(ARoomtype record);
}