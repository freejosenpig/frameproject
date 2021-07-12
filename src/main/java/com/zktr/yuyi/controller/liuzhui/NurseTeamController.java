package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseTeam;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.service.liuzhui.NurseTeamService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NurseTeam")
public class NurseTeamController {
    @Resource
    private NurseTeamService nurseTeamService;

    @Log("根据id查询单个护工组")
    @GetMapping("/select/{uid}")
    public NurseTeam selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseTeamService.queryById(uid);
    }

    @Log("查询所有护工组")
    @GetMapping("/selectAll")
    public List<NurseTeam> selectAll(){
        List<NurseTeam> list =  this.nurseTeamService.queryAll();
        System.out.println(this.nurseTeamService.queryAll());
        return list;
    }

    @Log("根据id删除护工组")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseTeamService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public NurseTeam updateById(@RequestBody NurseTeam nurseTeam){
        nurseTeamService.update(nurseTeam);
        return nurseTeam;
    }

    @Log("新增数据")
    @RequestMapping("/addNurse")
    public NurseTeam addNurse(@RequestBody NurseTeam nurseTeam){
        nurseTeamService.insert(nurseTeam);
        return nurseTeam;

    }
}
