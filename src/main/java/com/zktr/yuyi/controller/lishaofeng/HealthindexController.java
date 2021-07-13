package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;
import com.zktr.yuyi.service.lishaofeng.ipml.HealindexServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("service")
public class HealthindexController {
    @Autowired
    private HealindexServiceImp healindexServiceImp;
    @RequestMapping(value = "/Healindex",method = RequestMethod.GET)
    public AjaxResponse findallHealindex(){
        List<HealthindexResult> healthindexResults = healindexServiceImp.selectHealthbyperson();
        return  AjaxResponse.success(healthindexResults);
    }
    @RequestMapping(value = "/HealindexBypage/{page}/{size}",method = RequestMethod.GET)

    public AjaxResponse findallHealindexBypage(@PathVariable("page") int page, @PathVariable("size") int size){
        log.info(String.valueOf(page));
        PageInfo<HealthindexResult> healthindexResultPageInfo = healindexServiceImp.selectHealthbypersonpage(page, size);
        return  AjaxResponse.success(healthindexResultPageInfo);
    }
    @RequestMapping(value = "/Healindexdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = healindexServiceImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
}
