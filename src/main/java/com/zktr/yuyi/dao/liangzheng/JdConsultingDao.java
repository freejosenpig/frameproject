package com.zktr.yuyi.dao.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdConsulting;
import org.apache.ibatis.annotations.Mapper;

import java.util.*;
@Mapper
public interface JdConsultingDao {
    int deleteByPrimaryKey(Integer consultingId);

    int insert(JdConsulting record);

    int insertSelective(JdConsulting record);

    JdConsulting selectByPrimaryKey(Integer consultingId);

    int updateByPrimaryKeySelective(JdConsulting record);

    int updateByPrimaryKey(JdConsulting record);

    List<JdConsulting> selectAllConsulting();

    int insertConsulting(JdConsulting consulting);

    int updateConsulting(JdConsulting consulting);

    int deleteConsulting(JdConsulting consulting);
}