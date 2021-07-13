package com.zktr.yuyi.controller.liangzheng;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.liangzheng.JdOn;
import com.zktr.yuyi.service.liangzheng.JdOnservice;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JdOnController {
    @Resource
    private JdOnservice jdOnservice;

    @PostMapping("/insertOn/{addname}")
    public AjaxResponse insertOn(@PathVariable("addname")String addname, @RequestBody JdOn jdOn){
        jdOnservice.insert(addname, jdOn);
        return AjaxResponse.success(jdOn);
    }

    @GetMapping("/selectAllOn")
    public AjaxResponse selectAllOn(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<JdOn> jdOns=jdOnservice.selectAllON();
        PageInfo<JdOn> jdOnPageInfo=new PageInfo<>(jdOns);
        return AjaxResponse.success(jdOnPageInfo);
    }
}
