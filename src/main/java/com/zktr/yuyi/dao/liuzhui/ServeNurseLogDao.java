package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.NurseTeam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServeNurseLogDao {
    int deleteByPrimaryKey(Integer id);

    int insert(NurseLog record);

    int insertSelective(NurseLog record);

    NurseLog selectByPrimaryKey(Integer id);

    List<NurseLog> selectAll();

    List<NurseLog> selectAllByNurse(NurseLog nurseLog);

    int updateByPrimaryKeySelective(NurseLog record);

    int updateByPrimaryKey(NurseLog record);
}