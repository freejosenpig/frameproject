package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseType;
import com.zktr.yuyi.service.liuzhui.NurseTypeService;
import com.zktr.yuyi.service.liuzhui.NurseTypeService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NurseType")
public class NurseTypeController {
    @Resource
    private NurseTypeService nurseTypeService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public NurseType selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseTypeService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<NurseType> selectAll(){
        List<NurseType> list =  this.nurseTypeService.queryAll();
        System.out.println(this.nurseTypeService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseTypeService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public NurseType updateById(@RequestBody NurseType nurseType){
        nurseTypeService.update(nurseType);
        return nurseType;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public NurseType addNurse(@RequestBody NurseType nurseType){
        nurseTypeService.insert(nurseType);
        return nurseType;

    }
}
