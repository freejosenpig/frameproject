package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NurseLog")
public class NurseLogController {
    @Resource
    private NurseLogService nurseLogService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public NurseLog selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseLogService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<NurseLog> selectAll(){
        List<NurseLog> list =  this.nurseLogService.queryAll();
        System.out.println(this.nurseLogService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseLogService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public NurseLog updateById(@RequestBody NurseLog nurseLog){
        nurseLogService.update(nurseLog);
        return nurseLog;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public NurseLog addNurse(@RequestBody NurseLog nurseLog){
        nurseLogService.insert(nurseLog);
        return nurseLog;

    }
}
