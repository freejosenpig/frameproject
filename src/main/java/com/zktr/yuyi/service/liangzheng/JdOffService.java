package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOff;

import java.util.List;

public interface JdOffService {
    JdOff insert(String addname,JdOff record);

    JdOff updateOff(JdOff jdOff);

    JdOff deleteOff(JdOff jdOff);

    List<JdOff> selectAllOff();
}
