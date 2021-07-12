package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DrugRegistrationDao {
    int deleteByPrimaryKey(Integer msgId);

    int insert(DrugRegistration record);

    int insertSelective(DrugRegistration record);

    DrugRegistration selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(DrugRegistration record);

    int updateByPrimaryKey(DrugRegistration record);
    List<DrugRegResult>selectlinkbyperson();
}
