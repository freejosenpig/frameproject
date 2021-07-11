package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostList;
import com.zktr.yuyi.service.cost.CostListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CostListController {
    @Autowired
    private CostListService costListService;

    //根据编号修改流水信息
    @PostMapping("/updateListByKey")
    public CostList updateByKey(@RequestBody CostList costlist){
        costListService.updateByKey(costlist);
        return costlist;
    }
    //新增流水信息
    @GetMapping("/insertLCostist")
    public CostList insertLCostist(@RequestBody CostList costlist){
        costListService.insertLCostist(costlist);
        return costlist;
    }
}
