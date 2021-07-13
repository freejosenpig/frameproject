package com.zktr.yuyi.controller.liuzhui;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServiceNurse;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import com.zktr.yuyi.service.liuzhui.NurseService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/NurseLog")
public class NurseLogController {
    @Resource
    private NurseLogService nurseLogService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public AjaxResponse selectOne(@PathVariable(value = "uid") int uid){
        this.nurseLogService.queryById(uid);
        return AjaxResponse.success();
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public AjaxResponse selectAll(){
        List<NurseLog> list =  this.nurseLogService.queryAll();
        return AjaxResponse.success(list);
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseLogService.deleteById(uid);
        return AjaxResponse.success();
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public AjaxResponse updateById(@RequestBody NurseLog nurseLog){
        nurseLogService.update(nurseLog);
        return AjaxResponse.success();
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public AjaxResponse addNurse(@RequestBody NurseLog nurseLog){
        nurseLogService.insert(nurseLog);
        return AjaxResponse.success();

    }
    /**
     * 条件分页查询用户信息
     */
    @Log("分页查询用户信息")
    @PostMapping("/conditionpageuser")
    public AjaxResponse conditionpageuser(@RequestBody String conditionpage){
        JSONObject jsonObject = JSONObject.parseObject(conditionpage);
        String condition = jsonObject.getString("condition");//查询条件
        NurseLog user = JSON.parseObject(condition, NurseLog.class);

        int currentPage = Integer.parseInt(jsonObject.getString("currentPage"));
        int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));
        Map<String,Object> map=new HashMap<>();

        Page<Object> page= PageHelper.startPage(currentPage,pageSize);
        List<NurseLog> users = nurseLogService.queryAllByUser(user);
        map.put("total",page.getTotal());
        map.put("rows",users);
        return AjaxResponse.success(map);
    }
}
