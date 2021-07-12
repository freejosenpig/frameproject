package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdHealth;

public interface JdHealthDao {
    int deleteByPrimaryKey(Integer healthId);

    int insert(JdHealth record);

    int insertSelective(JdHealth record);

    JdHealth selectByPrimaryKey(Integer healthId);

    int updateByPrimaryKeySelective(JdHealth record);

    int updateByPrimaryKey(JdHealth record);
}