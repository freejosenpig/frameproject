package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicalRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;

import java.util.List;

public interface MedicalRegisterService {
    int deleteByPrimaryKey(Integer mrId);
    List<MedicalRegisterResult> selectMedicalbyperson();
    int updateByPrimaryKeySelective(MedicalRegistration record);

}
