package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOldpeople;

public interface JdOldpeopleDao {
    int deleteByPrimaryKey(Integer oldpeopleId);

    int insert(JdOldpeople record);

    int insertSelective(JdOldpeople record);

    JdOldpeople selectByPrimaryKey(Integer oldpeopleId);

    int updateByPrimaryKeySelective(JdOldpeople record);

    int updateByPrimaryKey(JdOldpeople record);
}