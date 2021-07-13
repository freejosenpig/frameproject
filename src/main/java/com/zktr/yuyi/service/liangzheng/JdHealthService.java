package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdHealth;

import java.util.List;

public interface JdHealthService {

    JdHealth insert(String addname,JdHealth record);

    List<JdHealth> selectAllHealth();

    JdHealth deleteHealth(JdHealth jdHealth);

    JdHealth updateHealth(JdHealth jdHealth);
}
