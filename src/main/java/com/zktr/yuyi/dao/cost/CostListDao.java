package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostListDao {
    int deleteByPrimaryKey(Integer listId);
    //新增流水信息
    int insert(CostList costList);

    int insertSelective(CostList record);

    CostList selectByPrimaryKey(Integer listId);
    //    根据编号修改流水信息
    int updateByKey(CostList costList);

    int updateByPrimaryKey(CostList record);

    //    根据老人编号查询流水信息
    List<CostList> selectByOldId(Integer oldId);

}