package com.zktr.yuyi.controller.liuzhui;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdConsulting;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.exception.CustomError;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public AjaxResponse selectOne(@PathVariable(value = "uid") int uid){
       ServiceNurse serviceNurse= this.nurseService.queryById(uid);
        return AjaxResponse.success();
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public AjaxResponse selectAll(){
        List<ServiceNurse> list =  this.nurseService.queryAll();
        return AjaxResponse.success(list);
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseService.deleteById(uid);
        return AjaxResponse.success();
    }

    @Log("根据id修改数据")
    @PutMapping("/updateNurse")
    public AjaxResponse updateById(@RequestBody ServiceNurse serviceNurse){
        nurseService.update(serviceNurse);
        return AjaxResponse.success();
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public AjaxResponse addNurse(@RequestBody ServiceNurse serviceNurse){
        nurseService.insert(serviceNurse);
        return  AjaxResponse.success();

    }

    /**
     * 条件分页查询用户信息
     */
    @Log("分页查询用户信息")
    @PostMapping("/conditionpageuser")
    public AjaxResponse conditionpageuser(@RequestBody String conditionpage){
        JSONObject jsonObject = JSONObject.parseObject(conditionpage);
        String condition = jsonObject.getString("condition");//查询条件
        ServiceNurse user = JSON.parseObject(condition, ServiceNurse.class);
        int currentPage = Integer.parseInt(jsonObject.getString("currentPage"));
        int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));
        Map<String,Object> map=new HashMap<>();
        Page<Object> page= PageHelper.startPage(currentPage,pageSize);
        List<ServiceNurse> users = nurseService.queryAllByUser(user);
        map.put("total",page.getTotal());
        map.put("rows",users);
        return AjaxResponse.success(map);
    }
}
