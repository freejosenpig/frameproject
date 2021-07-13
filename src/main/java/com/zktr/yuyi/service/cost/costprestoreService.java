package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostPrestore;

import java.util.List;

public interface costprestoreService {
    //    新增预存
    CostPrestore insertprestore(CostPrestore costPrestore);

    //    根据编号修改预存
    CostPrestore updateByKey(CostPrestore costPrestore);

    //    根据老人编号查询预存信息
    List<CostPrestore> selectByOldId(Integer oldId);

    //查询所有预存信息
    List<CostPrestore> selectAll();


    CostPrestore updateById(CostPrestore costPrestore);
}
