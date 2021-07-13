package com.zktr.yuyi.controller.cost;

import com.zktr.yuyi.entity.cost.CostOutstanding;
import com.zktr.yuyi.service.cost.CostOutstandingService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class CostOutController {
    @Autowired
    private CostOutstandingService costOutstandingService;

    //    查询所有
    @GetMapping("/seletcOutAll")
    public List<CostOutstanding> selectAll(){
        return  costOutstandingService.selectAll();
    }
    //    根据老人编号查询欠费信息
    @GetMapping("/selectOutByOldId")
    public AjaxResponse selectByOldId(@PathVariable Integer oldId){

        return AjaxResponse.success(costOutstandingService.selectByOldId(oldId));
    }
    //    新增欠费信息
    @PostMapping("/insertOutstanding")
    public AjaxResponse insertOutstanding(@RequestBody CostOutstanding costOutstanding){
        costOutstandingService.insert(costOutstanding);
        return AjaxResponse.success("新增成功");
    }
    //    修改欠费信息
    @PutMapping("/updateOutByKey")
    public AjaxResponse updateOutByKey(@RequestBody CostOutstanding costOutstanding){
        return AjaxResponse.success(costOutstandingService.updateByKey(costOutstanding));
    }
}
