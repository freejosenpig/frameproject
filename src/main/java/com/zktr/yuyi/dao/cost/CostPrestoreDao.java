package com.zktr.yuyi.dao.cost;

import com.zktr.yuyi.entity.cost.CostPrestore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CostPrestoreDao {
    int deleteByPrimaryKey(Integer prestoreId);
    //    新增预存
    int insert(CostPrestore record);

    int insertSelective(CostPrestore record);

    CostPrestore selectByPrimaryKey(Integer prestoreId);
    //    根据编号修改预存
    int updateByKey(CostPrestore costPrestore);

    int updateByPrimaryKey(CostPrestore record);

    //    根据老人编号查询预存信息
    List<CostPrestore> selectByOldId(Integer oldId);

    //查询所有预存信息
    List<CostPrestore> selectAll();

    int updateById(CostPrestore costPrestore);
}