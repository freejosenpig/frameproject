package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOn;

import java.util.List;

public interface JdOnservice {
    JdOn insert(String addname,JdOn record);

    List<JdOn> selectAllON();

    JdOn deleteOn(JdOn jdOn);

    JdOn updateOn(JdOn jdOn);
}
