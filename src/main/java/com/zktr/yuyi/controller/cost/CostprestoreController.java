package com.zktr.yuyi.controller.cost;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.liangzheng.JdOldpeopleDao;
import com.zktr.yuyi.entity.cost.CostList;
import com.zktr.yuyi.entity.cost.CostPrestore;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.cost.costprestoreService;
import com.zktr.yuyi.service.liangzheng.JdOldpeopleService;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class CostprestoreController {
    @Autowired
    private costprestoreService costprestoreService;
    @Resource
    private JdOldpeopleService oldpeopleService;

    //    新增预存
    @PostMapping("/insertprestore")
    public AjaxResponse insertprestore(@RequestBody CostPrestore costPrestore){
        System.out.println(costPrestore.toString());
        costprestoreService.insertprestore(costPrestore);
        return AjaxResponse.success(costPrestore);
    }

    //    根据编号修改预存
    @PutMapping("/updatePreByKey")
    public AjaxResponse updateByKey(@RequestBody CostPrestore costPrestore){
        costprestoreService.updateByKey(costPrestore);
        return AjaxResponse.success(costPrestore);
    }


    //根据老人编号查询预存信息
    @GetMapping("/selectPreByOldId")
    public AjaxResponse selectByOldId(@PathVariable Integer oldId){
        return AjaxResponse.success( costprestoreService.selectByOldId(oldId));
    }

    //查询所有预存信息
    @GetMapping("/selectPreAll")
    public AjaxResponse selectAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage, pagesize);
        List<CostPrestore> entityPage=costprestoreService.selectAll();
        PageInfo<CostPrestore> entryfeesPageInfo=new PageInfo<>(entityPage);
        return AjaxResponse.success(entryfeesPageInfo);
    }

    @GetMapping("/selectAllOldpeople")
    public AjaxResponse selectAllOldpeople(){
        return AjaxResponse.success(oldpeopleService.selectAllOldpeople());
    }


//    @PutMapping("/updateById")
//    public AjaxResponse updateById(@RequestBody CostPrestore costPrestore){
//        return AjaxResponse.success(costprestoreService.updateById(costPrestore));
//    }
}
