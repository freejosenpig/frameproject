package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.NursePlan;

import java.util.List;

public interface NursePlanService {

    /*
        通过id，查询。
     */
    NursePlan queryById(int nid);

    /*
        查询所有
     */
    List<NursePlan> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    NursePlan update(NursePlan nursePlan);
    /*
        增加数据
     */
    NursePlan insert(NursePlan nursePlan);
}
