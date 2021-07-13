package com.zktr.yuyi.controller.liangzheng;

import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.liangzheng.JdOldpeopleService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JdOldpeopleController {
    @Resource
    private JdOldpeopleService oldpeopleService;

    @PostMapping("/insertOldpeople/{addname}")
    public AjaxResponse insertOldpeople(@PathVariable("addname")String addname, @RequestBody JdOldpeople oldpeople){
        oldpeopleService.insert(addname,oldpeople);
        return AjaxResponse.success(oldpeople);
    }
}
