package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseTeam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServeNurseTeamDao {
    //根据Id删除护理小组
    int deleteByPrimaryKey(Integer id);

    //增加一条护理小组
    int insert(NurseTeam record);

    int insertSelective(NurseTeam record);
    //根据id查询护理小组
    NurseTeam selectByPrimaryKey(Integer id);
    //查询所有护理小组
    List<NurseTeam> selectAll();
    //修改护理小组
    int updateByPrimaryKeySelective(NurseTeam record);

    int updateByPrimaryKey(NurseTeam record);
}