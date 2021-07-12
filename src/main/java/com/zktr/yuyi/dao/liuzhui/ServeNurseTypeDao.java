package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ServeNurseTypeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseType record);

    int insertSelective(NurseType record);

    NurseType selectByPrimaryKey(Integer id);

    List<NurseType> selectAll();
    int updateByPrimaryKeySelective(NurseType record);

    int updateByPrimaryKey(NurseType record);
}