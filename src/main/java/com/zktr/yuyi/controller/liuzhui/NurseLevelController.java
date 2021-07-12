package com.zktr.yuyi.controller.liuzhui;

import com.zktr.yuyi.annotation.Log;
import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;
import com.zktr.yuyi.entity.liuzhui.ServeNurseLevel;
import com.zktr.yuyi.service.liuzhui.NurseLevelService;
import com.zktr.yuyi.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/NurseLevel")
public class NurseLevelController {

    @Resource
    private NurseLevelService nurseLevelService;

    @Log("根据id查询单个护工")
    @GetMapping("/select/{uid}")
    public ServeNurseLevel selectOne(@PathVariable(value = "uid") int uid){
        return this.nurseLevelService.queryById(uid);
    }

    @Log("查询所有护工")
    @GetMapping("/selectAll")
    public List<ServeNurseLevel> selectAll(){
        List<ServeNurseLevel> list =  this.nurseLevelService.queryAll();
        System.out.println(this.nurseLevelService.queryAll());
        return list;
    }

    @Log("根据id删除护工")
    @GetMapping("/delete/{uid}")
    public AjaxResponse deleteById(@PathVariable(value = "uid") int uid){
        this.nurseLevelService.deleteById(uid);
        return AjaxResponse.success(true);
    }

    @Log("根据id修改数据")
    @PostMapping(value = "/updateNurse")
    public ServeNurseLevel updateById(@RequestBody ServeNurseLevel serveNurseLevel){
        nurseLevelService.update(serveNurseLevel);
        return serveNurseLevel;
    }

    @Log("新增数据")
    @PostMapping("/addNurse")
    public ServeNurseLevel addNurse(@RequestBody ServeNurseLevel serveNurseLevel){
        nurseLevelService.insert(serveNurseLevel);
        return serveNurseLevel;

    }
}
