package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostBack;

import java.util.List;

public interface CostBackService {
    //    新增退住
    CostBack insertcostback(CostBack record);
    //根据编号修改退住信息
    CostBack updateByKey(CostBack costBack);
    //根据老人编号查询退住信息
    List<CostBack> selectByoldId(Integer oldId);
    //    查询所有退住信息
    List<CostBack> selectAll();
}
