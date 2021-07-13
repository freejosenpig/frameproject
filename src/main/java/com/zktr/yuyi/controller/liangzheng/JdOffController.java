package com.zktr.yuyi.controller.liangzheng;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.liangzheng.JdOff;
import com.zktr.yuyi.entity.liangzheng.JdOn;
import com.zktr.yuyi.service.liangzheng.JdOffService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JdOffController {
    @Resource
    private JdOffService jdOffService;

    @GetMapping("/selectAllOff")
    public AjaxResponse selectAllOff(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<JdOff> jdOffs=jdOffService.selectAllOff();
        PageInfo<JdOff> jdOffPageInfo=new PageInfo<>(jdOffs);
        return AjaxResponse.success(jdOffPageInfo);
    }

    @PostMapping("/insertOff/{addname}")
    public AjaxResponse insertOff(@PathVariable("addname") String addname,@RequestBody JdOff jdOff){
        jdOffService.insert(addname, jdOff);
        return AjaxResponse.success(jdOff);
    }
}
