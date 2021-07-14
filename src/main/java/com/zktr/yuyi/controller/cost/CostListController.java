package com.zktr.yuyi.controller.cost;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.cost.CostList;
import com.zktr.yuyi.service.cost.CostListService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    //查询流所有流水信息
    @GetMapping("/selectAll")
//    public List<CostList> selectAll(){
//        return costListService.selectAll();
//    }
    public AjaxResponse findEntryFees(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<CostList> entityPage=costListService.selectAll();
        PageInfo<CostList> entryfeesPageInfo=new PageInfo<>(entityPage);
        return AjaxResponse.success(entryfeesPageInfo);
    }
    //模糊查询流所有流水信息
    @GetMapping("/selectBycontion")
//    public List<CostList> selectAll(){
//        return costListService.selectAll();
//    }
    public AjaxResponse selectBycontion(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize,@PathVariable("oldpeopleName") String oldpeopleName){
        PageHelper.startPage(currentPage, pagesize);
        List<CostList> entityPage=costListService.selectBycontion(oldpeopleName);
        PageInfo<CostList> entryfeesPageInfo=new PageInfo<>(entityPage);
        return AjaxResponse.success(entryfeesPageInfo);
    }
}
