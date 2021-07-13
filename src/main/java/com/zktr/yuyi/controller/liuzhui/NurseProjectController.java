package com.zktr.yuyi.controller.liuzhui;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.NurseLog;
import com.zktr.yuyi.entity.liuzhui.ServeNurseProject;
import com.zktr.yuyi.service.liuzhui.NurseLogService;
import com.zktr.yuyi.service.liuzhui.NurseProjectService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/NurseProject")
public class NurseProjectController {
    @Resource
    private NurseProjectService nurseProjectService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public AjaxResponse selectOne(@PathVariable(value = "uid") int uid){
        this.nurseProjectService.queryById(uid);
        return AjaxResponse.success();
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public AjaxResponse selectAll(){
        List<ServeNurseProject> list =  this.nurseProjectService.queryAll();
        return AjaxResponse.success(list);
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseProjectService.deleteById(uid);
        return AjaxResponse.success();
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public AjaxResponse updateById(@RequestBody ServeNurseProject serveNurseProject){
        nurseProjectService.update(serveNurseProject);
        return AjaxResponse.success();
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public AjaxResponse addNurse(@RequestBody ServeNurseProject serveNurseProject){
        nurseProjectService.insert(serveNurseProject);
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
        ServeNurseProject user = JSON.parseObject(condition, ServeNurseProject.class);

        int currentPage = Integer.parseInt(jsonObject.getString("currentPage"));
        int pageSize = Integer.parseInt(jsonObject.getString("pageSize"));
        Map<String,Object> map=new HashMap<>();

        Page<Object> page= PageHelper.startPage(currentPage,pageSize);
        List<ServeNurseProject> users = nurseProjectService.queryAllByUser(user);
        map.put("total",page.getTotal());
        map.put("rows",users);
        return AjaxResponse.success(map);
    }
}
