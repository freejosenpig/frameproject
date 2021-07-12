package com.zktr.yuyi.service.liuzhui;

import com.zktr.yuyi.entity.liuzhui.NurseType;
import com.zktr.yuyi.entity.liuzhui.NurseType;

import java.util.List;

public interface NurseTypeService {
    /*
       通过id，查询。
    */
    NurseType queryById(int nid);

    /*
        查询所有
     */
    List<NurseType> queryAll();
    /*
        通过id，删除
     */
    boolean deleteById(int nid);

    /*
        修改数据
     */
    NurseType update(NurseType nurseType);
    /*
        增加数据
     */
    NurseType insert(NurseType nurseType);
}
