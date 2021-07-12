package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicalRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalRegistrationDao {
    int deleteByPrimaryKey(Integer mrId);

    int insert(MedicalRegistration record);

    int insertSelective(MedicalRegistration record);

    MedicalRegistration selectByPrimaryKey(Integer mrId);

    int updateByPrimaryKeySelective(MedicalRegistration record);

    int updateByPrimaryKey(MedicalRegistration record);
    List<MedicalRegisterResult>selectMedicalbyperson();

}
