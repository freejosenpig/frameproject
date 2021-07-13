package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;

import java.util.List;

public interface  DrugRegistrationService {
    int deleteByPrimaryKey(Integer msgId);
    //分页查询药物登记信息
    List<DrugRegResult> selectlinkbyperson();
    //修改药物登记表
    int updateByPrimaryKeySelective(DrugRegistration record);
}
