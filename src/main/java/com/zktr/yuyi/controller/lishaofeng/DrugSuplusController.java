package com.zktr.yuyi.controller.lishaofeng;


import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.DrugRegistration;
import com.zktr.yuyi.entity.lishaofeng.DrugSurplus;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import com.zktr.yuyi.service.lishaofeng.ipml.DrugSurplusServiceImp;

import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("service")
@Slf4j
public class DrugSuplusController {
    @Autowired
    private DrugSurplusServiceImp drugSurplusServiceImp;

    @RequestMapping(value = "/DrugSurplus", method = RequestMethod.GET)
    public AjaxResponse findallDrugRestration() {
        List<DrugSuplusResult> drugSuplusResults = drugSurplusServiceImp.selectSurplusbyperson();
        return AjaxResponse.success(drugSuplusResults);
    }

    @RequestMapping(value = "/DrugSurplusBypage", method = RequestMethod.GET)
    public AjaxResponse findallDrugSurplusBypage(@PathVariable("page") int page, @PathVariable("size") int size) {

        PageInfo<DrugSuplusResult> selectlinkbyperson = drugSurplusServiceImp.selectlinkbyperson(page, size);
        return AjaxResponse.success(selectlinkbyperson);
    }
    @RequestMapping(value = "/DrugSurplusdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = drugSurplusServiceImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
    @RequestMapping(value = "/DrugSurplusupdate",method = RequestMethod.POST)
    public AjaxResponse delectbypage(@RequestBody DrugSurplus drugSurplus) {
        drugSurplus.getMesId();
        log.info(String.valueOf(drugSurplus.getMesId()));
        log.info(drugSurplus.getBalancestatus());
        DrugSurplus drugRegistration1=new DrugSurplus();
        drugRegistration1.setMinimumSize(drugSurplus.getMinimumSize());
        drugRegistration1.setMname(drugSurplus.getMname());
        drugRegistration1.setSurplusmedine(drugSurplus.getSurplusmedine());
        drugRegistration1.setCreateTime(drugSurplus.getCreateTime());
        drugRegistration1.setMesId(drugSurplus.getMesId());
        int ok = drugSurplusServiceImp.updateByPrimaryKeySelective(drugRegistration1);
        return AjaxResponse.success(ok);
    }
}
