package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostEntryfees;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CostEntryfeesDao {
    int deleteByPrimaryKey(Integer entryfeesId);

    int insert(CostEntryfees record);

    int insertSelective(CostEntryfees record);

    CostEntryfees selectByPrimaryKey(Integer entryfeesId);

    int updateByPrimaryKeySelective(CostEntryfees record);

    int updateByPrimaryKey(CostEntryfees record);
}