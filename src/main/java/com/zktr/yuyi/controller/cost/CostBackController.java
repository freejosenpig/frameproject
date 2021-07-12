package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostBack;
import com.zktr.yuyi.service.cost.CostBackService;
import com.zktr.yuyi.vo.AjaxResponse;
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
    public AjaxResponse insertcostback(@RequestBody CostBack costBack){
        costBackService.insertcostback(costBack);
        return AjaxResponse.success(costBack);
    }

    //根据编号修改退住结算
    @PostMapping("/updateBackByKey")
    public AjaxResponse updateBackByKey(@RequestBody CostBack costBack){
        costBackService.updateByKey(costBack);
        return AjaxResponse.success("修改退住结算");
    }

    //编号根据老人编号查询退住信息
    @GetMapping("/selectBackByoldId/{oldId}")
    public AjaxResponse selectByoldId(@PathVariable("oldId") int oldId){
        return AjaxResponse.success(costBackService.selectByoldId(oldId));
    }

    //查询所有退住信息
//    @GetMapping("/selectBackAll")
//    public AjaxResponse selectAll(){
//        List<CostBack> costBackList= costBackService.selectAll();
//        return AjaxResponse.success(costBackList);
//    }
    //查询所有退住信息
    @GetMapping("/selectBackAll")
    public List<CostBack> selectAll(){
        return costBackService.selectAll();
    }
    @GetMapping("/selectBycontion/{backname}")
    public List<CostBack> selectBycontion(@PathVariable("backname") String backname){
        return costBackService.selectBycontion(backname);
    }
}
