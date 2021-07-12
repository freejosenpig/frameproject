package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostBack;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostBackDao {
    int deleteByPrimaryKey(Integer backId);
    //    新增退住
    int insert(CostBack costBack);

    int insertSelective(CostBack costBack);

    CostBack selectByPrimaryKey(Integer backId);

    //根据编号修改退住信息
    int updateByKey(CostBack costBack);

    int updateByPrimaryKey(CostBack costBack);

    //根据老人编号查询退住信息
    List<CostBack> selectByoldId(Integer oldId);

    //    查询所有退住信息
    List<CostBack> selectAll();

    //根据老人姓名模糊查询
    List<CostBack> selectBycontion(String backname);
}