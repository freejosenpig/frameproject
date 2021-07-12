package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdFamily;

public interface JdFamilyDao {
    int deleteByPrimaryKey(Integer familyId);

    int insert(JdFamily record);

    int insertSelective(JdFamily record);

    JdFamily selectByPrimaryKey(Integer familyId);

    int updateByPrimaryKeySelective(JdFamily record);

    int updateByPrimaryKey(JdFamily record);
}