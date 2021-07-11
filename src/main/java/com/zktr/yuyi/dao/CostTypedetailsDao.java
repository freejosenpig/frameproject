package com.zktr.yuyi.dao;

import com.zktr.yuyi.entity.CostTypedetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CostTypedetailsDao {
    int deleteByPrimaryKey(Integer itemId);

    int insert(CostTypedetails record);

    int insertSelective(CostTypedetails record);

    CostTypedetails selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(CostTypedetails record);

    int updateByPrimaryKey(CostTypedetails record);
}