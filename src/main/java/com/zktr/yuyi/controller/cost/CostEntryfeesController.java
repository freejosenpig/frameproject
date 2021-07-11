package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostEntryfees;
import com.zktr.yuyi.service.cost.CostEntryfeesService;
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
    public CostEntryfees insertentryfees(@RequestBody CostEntryfees costEntryfees){
        costEntryfeesService.insertentryfees(costEntryfees);
        return costEntryfees;
    }
    //    根据编号修改缴费
    @PutMapping("/updateEntryByKey")
    public CostEntryfees updateByKey(@RequestBody CostEntryfees costEntryfees){
        costEntryfeesService.updateByKey(costEntryfees);
        return costEntryfees;
    }
    //    根据老人编号查询缴费信息
    @GetMapping("/selectEntryByoldId")
    public List<CostEntryfees> selectByoldId(@PathVariable Integer oldId){
        return costEntryfeesService.selectByoldId(oldId);
    }
    //查询所有缴费信息
    @GetMapping("/selectEntryAll")
    public List<CostEntryfees> selectAll(){
        return costEntryfeesService.selectAll();
    }
}
