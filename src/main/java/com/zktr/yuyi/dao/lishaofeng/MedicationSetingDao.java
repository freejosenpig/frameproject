package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.MedicationSeting;
import com.zktr.yuyi.entity.lishaofeng.result.MedicationSetingsResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicationSetingDao {
    int deleteByPrimaryKey(Integer msId);

    int insert(MedicationSeting record);

    int insertSelective(MedicationSeting record);

    MedicationSeting selectByPrimaryKey(Integer msId);

    int updateByPrimaryKeySelective(MedicationSeting record);

    int updateByPrimaryKey(MedicationSeting record);
    List<MedicationSetingsResult>selectMedSetingbyperson();
}
