package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostType;
import com.zktr.yuyi.service.cost.CostTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CostTypecontroller {
    @Autowired
    private CostTypeService costtypeservice;

    //    新增费用类别设置
    @PostMapping("/addCostType")
    public CostType addCostType(@RequestBody CostType costType){
        costtypeservice.insertcosttype(costType);
        return costType;
    }
    //    修改费用类别设置
    @PutMapping("/updateCostType")
    public CostType updateCostType(@RequestBody CostType costType){
        costtypeservice.updateByKey(costType);
        return costType;
    }
    //    查询所有费用类别设置
    @GetMapping("/findAllCostType")
    public List<CostType> findAllCostType(){
        return  costtypeservice.selectAll();

    }
    //    根据编号查询类别设置
    @GetMapping("/findCostTypeById")
    public CostType findCostTypeById(@PathVariable int tyId){
        return  costtypeservice.findByKey(tyId);
    }
}
