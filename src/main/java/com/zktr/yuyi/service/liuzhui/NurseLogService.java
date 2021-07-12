package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;

import java.util.List;

public interface NurseLogService {

    /*
        通过id，查询。
     */
    NurseLog queryById(int nid);

    /*
        查询所有
     */
    List<NurseLog> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    NurseLog update(NurseLog nurseLog);
    /*
        增加数据
     */
    NurseLog insert(NurseLog nurseLog);
}
