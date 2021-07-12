package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.HealthIndex;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;

import java.util.List;

public interface HealindexService {
    List<HealthindexResult> selectHealthbyperson();
    int updateByPrimaryKeySelective(HealthIndex record);
}
