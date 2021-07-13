package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostList;
import com.zktr.yuyi.service.cost.CostListService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class CostListController {
    @Autowired
    private CostListService costListService;

    //根据编号修改流水信息
    @PutMapping("/updateListByKey")
    public AjaxResponse updateByKey(@RequestBody CostList costlist){
        costListService.updateByKey(costlist);
        return AjaxResponse.success(costlist);
    }
    //新增流水信息
    @PostMapping("/insertLCostist")
    public AjaxResponse insertLCostist(@RequestBody CostList costlist){
        costListService.insertLCostist(costlist);
        return AjaxResponse.success(costlist);
    }
    //根据老人编号查询流水信息
    @GetMapping("/selectByOldId")
    public AjaxResponse selectByOldId(@PathVariable Integer oldId){
        return AjaxResponse.success( costListService.selectByOldId(oldId));
    }
    //根据老人编号查询流水信息
    @GetMapping("/selectAll")
    public AjaxResponse selectAll(){
        return AjaxResponse.success(costListService.selectAll());
    }
}
