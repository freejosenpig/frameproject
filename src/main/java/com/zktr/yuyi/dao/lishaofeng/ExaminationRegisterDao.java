package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.ExaminationRegister;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExaminationRegisterDao {
    int deleteByPrimaryKey(Integer erId);

    int insert(ExaminationRegister record);

    int insertSelective(ExaminationRegister record);

    ExaminationRegister selectByPrimaryKey(Integer erId);

    int updateByPrimaryKeySelective(ExaminationRegister record);

    int updateByPrimaryKey(ExaminationRegister record);
    List<ExaminationRegistResult>selectExRegistbyperson();
}
