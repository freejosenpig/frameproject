package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostEntryfees;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostEntryfeesDao {
    int deleteByPrimaryKey(Integer entryfeesId);
    //    新增缴费
    int insert(CostEntryfees costEntryfees);

    int insertSelective(CostEntryfees record);

    CostEntryfees selectByPrimaryKey(Integer entryfeesId);
    //    根据编号修改缴费
    int updateByKey(CostEntryfees costEntryfees);

    int updateByPrimaryKey(CostEntryfees record);
    //根据老人编号查询缴费信息
    CostEntryfees selectByoldId(Integer oldId);

    //查询所有缴费信息
    List<CostEntryfees> selectAll();
}