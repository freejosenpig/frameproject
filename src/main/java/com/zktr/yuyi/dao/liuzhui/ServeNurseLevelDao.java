package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ServeNurseLevelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServeNurseLevel record);

    int insertSelective(ServeNurseLevel record);

    ServeNurseLevel selectByPrimaryKey(Integer id);
    List<ServeNurseLevel> selectAll();
    List<ServeNurseLevel> selectAllByNurse(ServeNurseLevel serveNurseLevel);
    int updateByPrimaryKeySelective(ServeNurseLevel record);

    int updateByPrimaryKey(ServeNurseLevel record);
}