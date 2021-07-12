package com.zktr.yuyi.controller.liuzhui;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.exception.CustomError;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.awt.*;
import java.util.List;

/**
 * 护工表(serve_nurse)Controller
 */
@RestController
@RequestMapping(value = "/serviceNurse")
public class NurseController {

    @Resource
    private NurseService nurseService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public ServiceNurse selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<ServiceNurse> selectAll(){
        List<ServiceNurse> list =  this.nurseService.queryAll();
        System.out.println(this.nurseService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public ServiceNurse updateById(@RequestBody ServiceNurse serviceNurse){
        nurseService.update(serviceNurse);
        return serviceNurse;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public ServiceNurse addNurse(@RequestBody ServiceNurse serviceNurse){
        nurseService.insert(serviceNurse);
        return serviceNurse;

    }
}
