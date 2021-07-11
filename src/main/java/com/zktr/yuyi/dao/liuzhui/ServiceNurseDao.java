package com.zktr.yuyi.dao.liuzhui;

import com.zktr.yuyi.entity.liuzhui.ServiceNurse;

public interface ServiceNurseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceNurse record);

    int insertSelective(ServiceNurse record);

    ServiceNurse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceNurse record);

    int updateByPrimaryKey(ServiceNurse record);
}