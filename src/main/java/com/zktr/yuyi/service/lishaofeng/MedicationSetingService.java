package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicationSeting;
import com.zktr.yuyi.entity.lishaofeng.result.MedicationSetingsResult;

import java.util.List;

public interface MedicationSetingService {
    List<MedicationSetingsResult> selectMedSetingbyperson();
    int updateByPrimaryKeySelective(MedicationSeting record);
}
