package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServeNurseProject;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import com.zktr.yuyi.service.liuzhui.NurseProjectService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NurseProject")
public class NurseProjectController {
    @Resource
    private NurseProjectService nurseProjectService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public ServeNurseProject selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseProjectService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<ServeNurseProject> selectAll(){
        List<ServeNurseProject> list =  this.nurseProjectService.queryAll();
        System.out.println(this.nurseProjectService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseProjectService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public ServeNurseProject updateById(@RequestBody ServeNurseProject serveNurseProject){
        nurseProjectService.update(serveNurseProject);
        return serveNurseProject;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public ServeNurseProject addNurse(@RequestBody ServeNurseProject serveNurseProject){
        nurseProjectService.insert(serveNurseProject);
        return serveNurseProject;

    }
}
