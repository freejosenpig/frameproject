package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugSurplus;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;

import java.util.List;

public interface DrugSurplusService {
    int deleteByPrimaryKey(Integer mesId);
    List<DrugSuplusResult> selectSurplusbyperson();
    int updateByPrimaryKeySelective(DrugSurplus record);
}
