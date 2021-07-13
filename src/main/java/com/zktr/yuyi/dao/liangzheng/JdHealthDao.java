package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdHealth;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface JdHealthDao {
    int deleteByPrimaryKey(Integer healthId);

    int insert(JdHealth record);

    int insertSelective(JdHealth record);

    JdHealth selectByPrimaryKey(Integer healthId);

    int updateByPrimaryKeySelective(JdHealth record);

    int updateByPrimaryKey(JdHealth record);

    List<JdHealth> selectAllHealth();

    int deleteHealth(JdHealth jdHealth);

    int updateHealth(JdHealth jdHealth);
}