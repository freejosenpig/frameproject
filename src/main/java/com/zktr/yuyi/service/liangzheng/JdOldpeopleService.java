package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOldpeople;

import java.util.List;

public interface JdOldpeopleService {

    JdOldpeople insert(String addname, JdOldpeople record);

    List<JdOldpeople> selectAllOldpeople();

    JdOldpeople deleteOldpeople(JdOldpeople jdOldpeople);

    JdOldpeople updateOldpeople(JdOldpeople jdOldpeople);

    JdOldpeople updateAccount(JdOldpeople jdOldpeople);

    JdOldpeople selectByPrimaryKey(Integer oldpeopleId);
}
