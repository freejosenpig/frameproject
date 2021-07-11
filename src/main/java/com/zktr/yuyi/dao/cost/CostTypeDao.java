package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CostTypeDao {
    int deleteByPrimaryKey(Integer typeId);

    int insert(CostType record);

    int insertSelective(CostType record);

    CostType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(CostType record);

    int updateByPrimaryKey(CostType record);
}