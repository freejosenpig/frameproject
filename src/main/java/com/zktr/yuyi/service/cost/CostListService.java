package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostList;

import java.util.List;

public interface CostListService {
    //    根据编号修改流水信息
   CostList updateByKey(CostList costList);
    //新增流水信息
    CostList insertLCostist(CostList costList);

    //    根据老人编号查询流水信息
    List<CostList> selectByOldId(Integer oldId);
    //查询所有流水信息
    List<CostList> selectAll();
}
