package com.zktr.yuyi.service.cost;

import com.zktr.yuyi.entity.cost.CostType;
import com.zktr.yuyi.entity.cost.CostTypedetails;

import java.util.List;

public interface CostTypeService {
    //    新增费用类别
    CostType insertcosttype(CostType costType);
    //  修改费用类别
    CostType updateByKey(CostType costType);
    //查询所有费用类别
    List<CostType> selectAll();
    //    根据编号查询费用类别
    CostType findByKey(Integer typeId);

    //------------------------------------------费用详细-------------------------------------------------------------
    //    新增费用类别详细
    CostTypedetails insertdetails(CostTypedetails costTypedetails);
    //    修改费用详情
    CostTypedetails updateByKey(CostTypedetails costTypedetails);
    //    根据类别编号查询费用详情
    List<CostTypedetails> selectBytypeId(int typeId);
    //    查询所有费用详情
    List<CostTypedetails> selectAlldetails();
    //    删除费用详情
    int deleteByPrimaryKey(Integer itemId);
}
