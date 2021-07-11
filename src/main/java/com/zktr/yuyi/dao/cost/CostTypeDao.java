package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostTypeDao {
    int deleteByPrimaryKey(Integer typeId);
    //    新增费用类别
    int insert(CostType costType);

    int insertSelective(CostType record);

    //    根据编号查询费用类别
    CostType selectByKey(Integer typeId);

    //    根据编号修改费用类别
    int updateByKey(CostType costType);


    int updateByPrimaryKey(CostType record);

    //    查询所有费用类别
    List<CostType> selectAll();
}