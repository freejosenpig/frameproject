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
    public AjaxResponse selectAll(){
        costOutstandingService.selectAll();
        return AjaxResponse.success("新增成功");
    }
    //    根据老人编号查询欠费信息
    @GetMapping("/selectOutByOldId")
    public AjaxResponse selectByOldId(Integer oldId){
        costOutstandingService.selectByOldId(oldId);
        return AjaxResponse.success("查询成功");
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
        costOutstandingService.updateByKey(costOutstanding);
        return AjaxResponse.success("修改成功");
    }
}
