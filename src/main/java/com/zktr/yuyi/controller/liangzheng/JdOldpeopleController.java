package com.zktr.yuyi.controller.liangzheng;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.liangzheng.JdOff;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.liangzheng.JdOldpeopleService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
public class JdOldpeopleController {
    @Resource
    private JdOldpeopleService oldpeopleService;

    @PostMapping("/insertOldpeople/{addname}")
    public AjaxResponse insertOldpeople(@PathVariable("addname")String addname, @RequestBody JdOldpeople oldpeople){
        oldpeopleService.insert(addname,oldpeople);
        return AjaxResponse.success(oldpeople);
    }

    @GetMapping("/selestOldpeople")
    public AjaxResponse selestOldpeople(){
        List<JdOldpeople> jdOldpeople=oldpeopleService.selectAllOldpeople();
        return AjaxResponse.success(jdOldpeople);
    }

    @GetMapping("/selectAllOldpeople")
    public AjaxResponse selectAllOldpeople(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<JdOldpeople> oldpeople=oldpeopleService.selectAllOldpeople();
        PageInfo<JdOldpeople> oldpeoplePageInfo=new PageInfo<>(oldpeople);
        return AjaxResponse.success(oldpeoplePageInfo);
    }

    @PutMapping("/updateOldpeople")
    public AjaxResponse updateOldpeople(@RequestBody JdOldpeople jdOldpeople){
        oldpeopleService.updateOldpeople(jdOldpeople);
        return AjaxResponse.success(jdOldpeople);
    }

}
