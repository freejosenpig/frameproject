package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostBack;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.cost.CostBackService;
import com.zktr.yuyi.service.liangzheng.JdOldpeopleService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RestController
@Slf4j
public class CostBackController {
    @Autowired
    private CostBackService costBackService;
    @Resource
    private JdOldpeopleService oldpeopleService;

    //新增退住结算
    @PostMapping("/insertcostback")
    public AjaxResponse insertcostback(@RequestBody CostBack costBack){
        costBackService.insertcostback(costBack);
        return AjaxResponse.success(costBack);
    }

    //根据编号修改退住结算
    @PutMapping("/updateBackByKey")
    public AjaxResponse updateBackByKey(@RequestBody CostBack costBack){
        return AjaxResponse.success(costBackService.updateByKey(costBack));
    }

    //编号根据老人编号查询退住信息
    @GetMapping("/selectBackByoldId/{oldId}")
    public AjaxResponse selectByoldId(@PathVariable("oldId") int oldId){
        CostBack costBack=costBackService.selectByoldId(oldId);
        return AjaxResponse.success(costBack);
    }

    //查询所有退住信息
//    @GetMapping("/selectBackAll")
//    public AjaxResponse selectAll(){
//        List<CostBack> costBackList= costBackService.selectAll();
//        return AjaxResponse.success(costBackList);
//    }
    //查询所有退住信息
    @GetMapping("/selectBackAll")
    public AjaxResponse selectAll(){
        List<CostBack> costBacks=costBackService.selectAll();
        return AjaxResponse.success(costBacks);
    }
    //根据老人姓名模糊查询
    @GetMapping("/selectBycontion/{backname}")
    public List<CostBack> selectBycontion(@PathVariable("backname") String backname){
        return costBackService.selectBycontion(backname);
    }
//    //根据老人编号修改退住结算
//    @PutMapping("/updateisback/{oldId}")
//    public CostBack updateisback(@PathVariable("oldId") Integer oldId){
//        return costBackService.updateisback(oldId);
//    }

    //根据老人编号修改老人账户余额
    @PutMapping("/updateAccount")
    public AjaxResponse updateAccount(@RequestBody JdOldpeople jdOldpeople ){
        return AjaxResponse.success(oldpeopleService.updateAccount(jdOldpeople));
    }
//    根据老人编号查询老人信息
    @GetMapping("/selectByPrimaryKey/{OldId}")
    public AjaxResponse selectByPrimaryKey(@PathVariable Integer OldId){
        return AjaxResponse.success(oldpeopleService.selectByPrimaryKey(OldId));
    }
}
