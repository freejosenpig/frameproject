package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostEntryfees;
import com.zktr.yuyi.service.cost.CostEntryfeesService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CostEntryfeesController {
    @Autowired
    private CostEntryfeesService costEntryfeesService;

    //    新增缴费
    @PostMapping("/insertentryfees")
    public AjaxResponse insertentryfees(@RequestBody CostEntryfees costEntryfees){
        costEntryfeesService.insertentryfees(costEntryfees);
        return AjaxResponse.success(costEntryfees);
    }
    //    根据编号修改缴费
    @PutMapping("/updateEntryByKey")
    public AjaxResponse updateByKey(@RequestBody CostEntryfees costEntryfees){
        costEntryfeesService.updateByKey(costEntryfees);
        return AjaxResponse.success("修改成功");
    }
    //    根据老人编号查询缴费信息
    @GetMapping("/selectEntryByoldId")
    public AjaxResponse selectByoldId(@PathVariable Integer oldId){
          costEntryfeesService.selectByoldId(oldId);
        return AjaxResponse.success("查询成功");
    }
    //查询所有缴费信息
    @GetMapping("/selectEntryAll")
    public AjaxResponse selectAll(){
        costEntryfeesService.selectAll();
        return AjaxResponse.success("查询成功");
    }
}
