package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostOutstanding;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostOutstandingDao {
    int deleteByPrimaryKey(Integer outstandingId);
    //    新增欠费信息
    int insert(CostOutstanding costOutstanding);

    int insertSelective(CostOutstanding record);

    CostOutstanding selectByPrimaryKey(Integer outstandingId);
    //     根据编号修改欠费信息
    CostOutstanding updateByKey(CostOutstanding record);

    int updateByPrimaryKey(CostOutstanding record);

    //    根据老人编号查询欠费信息
    List<CostOutstanding> selectByOldId(Integer oldId);

    //查询所有欠费信息
    List<CostOutstanding> selectAll();
}