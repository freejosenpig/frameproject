package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServeNurseProject;

import java.util.List;

public interface NurseProjectService {
    /*
       通过id，查询。
    */
    ServeNurseProject queryById(int nid);

    /*
        查询所有
     */
    List<ServeNurseProject> queryAll();
    /**
     * 多条件查询
     */
    List<ServeNurseProject> queryAllByUser(ServeNurseProject serveNurseProject);
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    ServeNurseProject update(ServeNurseProject serveNurseProject);
    /*
        增加数据
     */
    ServeNurseProject insert(ServeNurseProject serveNurseProject);
}
