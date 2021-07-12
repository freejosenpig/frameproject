package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.DrugsDeposit;
import com.zktr.yuyi.entity.lishaofeng.result.DrugsDepositResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DrugsDepositDao {
    int deleteByPrimaryKey(Integer ddId);

    int insert(DrugsDeposit record);

    int insertSelective(DrugsDeposit record);

    DrugsDeposit selectByPrimaryKey(Integer ddId);

    int updateByPrimaryKeySelective(DrugsDeposit record);

    int updateByPrimaryKey(DrugsDeposit record);
    List<DrugsDepositResult>selectDepositbyperson();
}
