package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.ABad;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;
@Mapper
public interface ABadDao {
    int deleteByPrimaryKey(Integer badId);

    int insert(ABad record);

    int insertSelective(ABad record);

    ABad selectByPrimaryKey(Integer badId);

    int updateByPrimaryKeySelective(ABad record);

    int updateByPrimaryKey(ABad record);

    List<ABad> selectAllBed();
}