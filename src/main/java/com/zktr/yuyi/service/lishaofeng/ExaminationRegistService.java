package com.zktr.yuyi.service.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.ExaminationRegister;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;

import java.util.List;

public interface ExaminationRegistService {
    int deleteByPrimaryKey(Integer erId);
    List<ExaminationRegistResult> selectExRegistbyperson();
    int updateByPrimaryKeySelective(ExaminationRegister record);

    int insertSelective(ExaminationRegister record);
}
