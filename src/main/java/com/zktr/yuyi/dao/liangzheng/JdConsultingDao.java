package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdConsulting;

public interface JdConsultingDao {
    int deleteByPrimaryKey(Integer consultingId);

    int insert(JdConsulting record);

    int insertSelective(JdConsulting record);

    JdConsulting selectByPrimaryKey(Integer consultingId);

    int updateByPrimaryKeySelective(JdConsulting record);

    int updateByPrimaryKey(JdConsulting record);
}