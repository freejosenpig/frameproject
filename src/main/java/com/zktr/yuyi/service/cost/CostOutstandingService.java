package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostOutstanding;

import java.util.List;

public interface CostOutstandingService {
    //    新增欠费信息
    CostOutstanding insert(com.zktr.yuyi.entity.cost.CostOutstanding costOutstanding);
    //根据编号修改欠费信息
    CostOutstanding updateByKey(CostOutstanding record);

    //    根据老人编号查询欠费信息
    List<CostOutstanding> selectByOldId(Integer oldId);
    //查询所有欠费信息
    List<CostOutstanding> selectAll();
}
