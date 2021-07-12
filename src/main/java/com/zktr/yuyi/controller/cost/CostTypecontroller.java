package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostType;
import com.zktr.yuyi.entity.cost.CostTypedetails;
import com.zktr.yuyi.service.cost.CostTypeService;
import com.zktr.yuyi.vo.AjaxResponse;
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
    public AjaxResponse addCostType(@RequestBody CostType costType){
        costtypeservice.insertcosttype(costType);
        return AjaxResponse.success(costType);
    }
    //    修改费用类别设置
    @PutMapping("/updateCostType")
    public AjaxResponse updateCostType(@RequestBody CostType costType){
        costtypeservice.updateByKey(costType);
        return AjaxResponse.success(costType);
    }
    //    查询所有费用类别设置
    @GetMapping("/findAllCostType")
    public AjaxResponse findAllCostType(){
        return AjaxResponse.success(costtypeservice.selectAll());

    }
    //    根据编号查询类别设置
    @GetMapping("/findCostTypeById")
    public AjaxResponse findCostTypeById(@PathVariable int tyId){
        return AjaxResponse.success(costtypeservice.findByKey(tyId));
    }
    //    联合类别设置，查询所有费用详情
    @GetMapping("/findAlldetails")
    public AjaxResponse findAlldetails(){
        return AjaxResponse.success(costtypeservice.selectAlldetails());
    }
}
