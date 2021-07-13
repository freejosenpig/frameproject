package com.zktr.yuyi.controller.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdFamily;
import com.zktr.yuyi.service.liangzheng.JdFamilyService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JdFamilyController {
    @Resource
    private JdFamilyService jdFamilyService;

    @PostMapping("/insertFamily/{addname}")
    public AjaxResponse insertFamily(@PathVariable("addname")String addname, @RequestBody JdFamily jdFamily){
        jdFamilyService.insert(addname, jdFamily);
        return AjaxResponse.success(jdFamily);
    }
}
