package com.zktr.yuyi.controller.lishaofeng;


import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import com.zktr.yuyi.service.lishaofeng.ipml.DrugSurplusServiceImp;

import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
}
