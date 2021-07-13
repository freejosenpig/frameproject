package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOn;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;

@Mapper
public interface JdOnDao {
    int deleteByPrimaryKey(Integer onId);

    int insert(JdOn record);

    int insertSelective(JdOn record);

    JdOn selectByPrimaryKey(Integer onId);

    int updateByPrimaryKeySelective(JdOn record);

    int updateByPrimaryKey(JdOn record);

    List<JdOn> selectAllON();

    int deleteOn(JdOn jdOn);

    int updateOn(JdOn jdOn);
}