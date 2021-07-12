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

    /**
     * 查询所有咨询
     * @return
     */
    List<JdConsulting> selectAllConsulting();

    /**
     * 新增咨询
     * @param consulting
     * @return
     */
    int insertConsulting(JdConsulting consulting);

    /**
     * 修改咨询
     * @param consulting
     * @return
     */
    int updateConsulting(JdConsulting consulting);

    /**
     * 删除咨询
     * @param consulting
     * @return
     */
    int deleteConsulting(JdConsulting consulting);

    /**
     * 根据老人姓名查询咨询
     * @param id
     * @return
     */
    JdConsulting selectConsultingById(Integer id);
}