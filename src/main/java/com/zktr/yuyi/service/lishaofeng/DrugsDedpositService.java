package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugsDeposit;
import com.zktr.yuyi.entity.lishaofeng.result.DrugsDepositResult;

import java.util.List;

public interface DrugsDedpositService {
    int deleteByPrimaryKey(Integer ddId);
    List<DrugsDepositResult> selectDepositbyperson();
    int updateByPrimaryKeySelective(DrugsDeposit record);
}
