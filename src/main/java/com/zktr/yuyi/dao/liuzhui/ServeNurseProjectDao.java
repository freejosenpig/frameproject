package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServeNurseProject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServeNurseProjectDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServeNurseProject record);

    int insertSelective(ServeNurseProject record);

    ServeNurseProject selectByPrimaryKey(Integer id);
    List<ServeNurseProject> selectAll();

    int updateByPrimaryKeySelective(ServeNurseProject record);

    int updateByPrimaryKey(ServeNurseProject record);
}