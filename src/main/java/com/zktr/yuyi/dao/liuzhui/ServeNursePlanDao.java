package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NursePlan;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface ServeNursePlanDao {
    int deleteByPrimaryKey(Integer id);

    int insert(NursePlan record);

    int insertSelective(NursePlan record);

    NursePlan selectByPrimaryKey(Integer id);

    List<NursePlan> selectAll();
    int updateByPrimaryKeySelective(NursePlan record);

    int updateByPrimaryKey(NursePlan record);
}