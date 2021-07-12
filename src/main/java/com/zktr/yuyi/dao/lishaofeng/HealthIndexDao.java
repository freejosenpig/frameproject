package com.zktr.yuyi.dao.lishaofeng;

import com.zktr.yuyi.entity.lishaofeng.HealthIndex;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HealthIndexDao {
    int deleteByPrimaryKey(Integer hrId);

    int insert(HealthIndex record);

    int insertSelective(HealthIndex record);

    HealthIndex selectByPrimaryKey(Integer hrId);

    int updateByPrimaryKeySelective(HealthIndex record);

    int updateByPrimaryKey(HealthIndex record);
    List<HealthindexResult>selectHealthbyperson();
}
