package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ServiceNurseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceNurse record);

    int insertSelective(ServiceNurse record);

    ServiceNurse selectByPrimaryKey(Integer id);

    List<ServiceNurse> selectAll();

    /**
     * 多条件查询
     */
    List<ServiceNurse> selectAllByNurse(ServiceNurse serviceNurse);

    int updateByPrimaryKeySelective(ServiceNurse record);

    int updateByPrimaryKey(ServiceNurse record);
}