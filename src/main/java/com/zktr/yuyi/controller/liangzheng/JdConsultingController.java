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
    public AjaxResponse selectAllConsulting(@RequestParam("a") int currentPage, @RequestParam("b") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<JdConsulting> consultings=consultingService.selectAllConsulting();
        PageInfo<JdConsulting> consultingPageInfo=new PageInfo<>(consultings);
        return AjaxResponse.success(consultingPageInfo);
    }

    @GetMapping("/selectConsulting")
    public List<JdConsulting> selectConsulting(){
        return consultingService.selectAllConsulting();
    }

    @GetMapping("/selectConsultingById")
    public JdConsulting selectConsultingById(@RequestParam("what") Integer id){
        return consultingService.selectConsultingById(id);
    }

    @PostMapping("/insertConsulting/{addname}")
    public AjaxResponse insertConsulting(@PathVariable("addname") String addname,@RequestBody JdConsulting jdConsulting){
        consultingService.insertConsulting(addname,jdConsulting);
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
