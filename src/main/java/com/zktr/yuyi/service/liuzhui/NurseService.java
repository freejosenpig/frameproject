package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.ServiceNurse;

import java.util.List;

/*
    serve_nurse(护工表)服务接口
 */
public interface NurseService {

    /*
        通过id，查询。
     */
    ServiceNurse queryById(int nid);

    /*
        查询所有
     */
    List<ServiceNurse> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    ServiceNurse update(ServiceNurse serviceNurse);
    /*
        增加数据
     */
    ServiceNurse insert(ServiceNurse serviceNurse);
}
