package com.zktr.yuyi.controller.liangzheng;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.liangzheng.JdConsulting;
import com.zktr.yuyi.service.liangzheng.JdConsultingService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class JdConsultingController {
    @Resource
    private JdConsultingService consultingService;

    @GetMapping("/selectAllConsulting")
    public PageInfo<JdConsulting> selectAllConsulting(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<JdConsulting> consultings=consultingService.selectAllConsulting();
        PageInfo<JdConsulting> consultingPageInfo=new PageInfo<>(consultings);
        return consultingPageInfo;
    }

    @PostMapping("/insertConsulting")
    public AjaxResponse insertConsulting(@RequestBody JdConsulting jdConsulting){
        consultingService.insertConsulting(jdConsulting);
        return AjaxResponse.success("新增成功");
    }

    @PutMapping("/updateConsulting")
    public AjaxResponse updateConsulting(@RequestBody JdConsulting jdConsulting){
        consultingService.updateConsulting(jdConsulting);
        return AjaxResponse.success("修改成功");
    }

    @PutMapping("/deleteConsulting")
    public AjaxResponse deleteConsulting(@RequestBody JdConsulting jdConsulting){
        consultingService.deleteConsulting(jdConsulting);
        return AjaxResponse.success("删除成功");
    }
}
