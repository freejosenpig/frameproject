package com.zktr.yuyi.controller.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdHealth;
import com.zktr.yuyi.service.liangzheng.JdHealthService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JdHealthController {
    @Resource
    public JdHealthService healthService;

    @PostMapping("/insertHealth/{addname}")
    public AjaxResponse insertHealth(@PathVariable("addname")String addname, @RequestBody JdHealth jdHealth){
        healthService.insert(addname, jdHealth);
        return AjaxResponse.success(jdHealth);
    }
}
