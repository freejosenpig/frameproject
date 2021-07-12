package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugSurplus;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugSurplusDao {
    int deleteByPrimaryKey(Integer mesId);

    int insert(DrugSurplus record);

    int insertSelective(DrugSurplus record);

    DrugSurplus selectByPrimaryKey(Integer mesId);

    int updateByPrimaryKeySelective(DrugSurplus record);

    int updateByPrimaryKey(DrugSurplus record);
    List<DrugSuplusResult>selectSurplusbyperson();
}
