package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NursePlan;
import com.zktr.yuyi.entity.liuzhui.NursePlan;
import com.zktr.yuyi.service.liuzhui.NursePlanService;
import com.zktr.yuyi.service.liuzhui.NursePlanService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NursePlan")
public class NursePlanController {
    @Resource
    private NursePlanService nursePlanService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public NursePlan selectOne(@PathVariable(value = "uid") int uid){
        return this.nursePlanService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<NursePlan> selectAll(){
        List<NursePlan> list =  this.nursePlanService.queryAll();
        System.out.println(this.nursePlanService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nursePlanService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public NursePlan updateById(@RequestBody NursePlan nursePlan){
        nursePlanService.update(nursePlan);
        return nursePlan;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public NursePlan addNurse(@RequestBody NursePlan nursePlan){
        nursePlanService.insert(nursePlan);
        return nursePlan;

    }
}
