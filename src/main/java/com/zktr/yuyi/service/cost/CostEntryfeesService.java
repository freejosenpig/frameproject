package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostEntryfees;

import java.util.List;

public interface CostEntryfeesService {
    //    新增缴费
    CostEntryfees insertentryfees(CostEntryfees costEntryfees);
    //    根据编号修改缴费
    CostEntryfees updateByKey(CostEntryfees costEntryfees);
    //根据老人编号查询缴费信息
    List<CostEntryfees> selectByoldId(Integer oldId);
    //查询所有缴费信息
    List<CostEntryfees> selectAll();
}
