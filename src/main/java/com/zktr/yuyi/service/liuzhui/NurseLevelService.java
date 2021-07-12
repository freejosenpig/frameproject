package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;
import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;

import java.util.List;

public interface NurseLevelService {

    /*
        通过id，查询。
     */
    ServeNurseLevel queryById(int nid);

    /*
        查询所有
     */
    List<ServeNurseLevel> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    ServeNurseLevel update(ServeNurseLevel serveNurseLevel);
    /*
        增加数据
     */
    ServeNurseLevel insert(ServeNurseLevel serveNurseLevel);
}
