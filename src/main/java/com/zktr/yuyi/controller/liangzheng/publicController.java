package com.zktr.yuyi.controller.liangzheng;

import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class publicController {
    @Resource
    private NurseService nurseService;

    @GetMapping("/selectAllNurse")
    public AjaxResponse selectAllNurse(){
        List<ServiceNurse> serviceNurses=nurseService.queryAll();
        return AjaxResponse.success(serviceNurses);
    }
}
