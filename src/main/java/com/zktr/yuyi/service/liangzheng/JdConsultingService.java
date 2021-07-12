package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdConsulting;

import java.util.List;

public interface JdConsultingService {
    List<JdConsulting> selectAllConsulting();

    JdConsulting insertConsulting(JdConsulting consulting);

    JdConsulting updateConsulting(JdConsulting consulting);

    JdConsulting deleteConsulting(JdConsulting consulting);
}
