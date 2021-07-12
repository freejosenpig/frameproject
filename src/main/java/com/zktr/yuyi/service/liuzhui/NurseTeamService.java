package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseTeam;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;

import java.util.List;

public interface NurseTeamService {
    /*
       通过id，查询。
    */
    NurseTeam queryById(int nid);

    /*
        查询所有
     */
    List<NurseTeam> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    NurseTeam update(NurseTeam nurseTeam);
    /*
        增加数据
     */
    NurseTeam insert(NurseTeam nurseTeam);
}
