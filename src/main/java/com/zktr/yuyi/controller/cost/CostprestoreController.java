package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostPrestore;
import com.zktr.yuyi.service.cost.costprestoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@Slf4j
public class CostprestoreController {
    @Autowired
    private costprestoreService costprestoreService;

    //    新增预存
    @PostMapping("/insertprestore")
    public CostPrestore insertprestore(@RequestBody CostPrestore costPrestore){
        costprestoreService.insertprestore(costPrestore);
        return costPrestore;
    }

    //    根据编号修改预存
    @PutMapping("/updatePreByKey")
    public CostPrestore updateByKey(@RequestBody CostPrestore costPrestore){
        costprestoreService.updateByKey(costPrestore);
        return costPrestore;
    }


    //根据老人编号查询预存信息
    @GetMapping("/selectPreByOldId")
    public List<CostPrestore> selectByOldId(@PathVariable Integer oldId){
        return costprestoreService.selectByOldId(oldId);
    }

    //查询所有预存信息
    @GetMapping("/selectPreAll")
    public List<CostPrestore> selectAll(){
        return costprestoreService.selectAll();
    }
}
