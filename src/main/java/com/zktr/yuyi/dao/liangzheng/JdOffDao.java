package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOff;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface JdOffDao {
    int deleteByPrimaryKey(Integer offId);

    int insert(JdOff record);

    int insertSelective(JdOff record);

    JdOff selectByPrimaryKey(Integer offId);

    int updateByPrimaryKeySelective(JdOff record);

    int updateByPrimaryKey(JdOff record);

    int updateOff(JdOff jdOff);

    int deleteOff(JdOff jdOff);

    List<JdOff> selectAllOff();
}