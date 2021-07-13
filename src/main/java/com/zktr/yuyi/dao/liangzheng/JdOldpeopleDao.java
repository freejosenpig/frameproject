package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;
@Mapper
public interface JdOldpeopleDao {
    int deleteByPrimaryKey(Integer oldpeopleId);

    int insert(JdOldpeople record);

    int insertSelective(JdOldpeople record);

    JdOldpeople selectByPrimaryKey(Integer oldpeopleId);

    int updateByPrimaryKeySelective(JdOldpeople record);

    int updateByPrimaryKey(JdOldpeople record);

    List<JdOldpeople> selectAllOldpeople();

    int deleteOldpeople(JdOldpeople jdOldpeople);

    int updateOldpeople(JdOldpeople jdOldpeople);

    int updateAccount(JdOldpeople jdOldpeople);
}