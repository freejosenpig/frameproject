package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostBack;
import com.zktr.yuyi.service.cost.CostBackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CostBackController {
    @Autowired
    private CostBackService costBackService;

    //新增退住结算
    @PostMapping("/insertcostback")
    public CostBack insertcostback(@RequestBody CostBack costBack){
        costBackService.insertcostback(costBack);
        return costBack;
    }

    //根据编号修改退住结算
    @PostMapping("/updateBackByKey")
    public CostBack updateBackByKey(@RequestBody CostBack costBack){
        costBackService.updateByKey(costBack);
        return costBack;
    }

    //编号根据老人编号查询退住信息
    @GetMapping("/selectBackByoldId")
    public List<CostBack> selectByoldId(@PathVariable int oldId){
        return costBackService.selectByoldId(oldId);
    }

    //查询所有退住信息
    @GetMapping("/selectBackAll")
    public List<CostBack> selectAll(){
        return costBackService.selectAll();
    }

}
