package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdFamily;

import java.util.List;

public interface JdFamilyService {

    JdFamily insert(String addname,JdFamily record);

    List<JdFamily> selectAllFamily();

    JdFamily deleteFamily(JdFamily jdFamily);

    JdFamily updateFamily(JdFamily jdFamily);
}
