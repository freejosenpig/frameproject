package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdFamily;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface JdFamilyDao {
    int deleteByPrimaryKey(Integer familyId);

    int insert(JdFamily record);

    int insertSelective(JdFamily record);

    JdFamily selectByPrimaryKey(Integer familyId);

    int updateByPrimaryKeySelective(JdFamily record);

    int updateByPrimaryKey(JdFamily record);

    List<JdFamily> selectAllFamily();

    int deleteFamily(JdFamily jdFamily);

    int updateFamily(JdFamily jdFamily);
}