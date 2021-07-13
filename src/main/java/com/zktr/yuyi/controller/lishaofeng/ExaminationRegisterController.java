package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;
import com.zktr.yuyi.service.lishaofeng.ipml.DrugSurplusServiceImp;
import com.zktr.yuyi.service.lishaofeng.ipml.ExaminationRegistServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("service")
public class ExaminationRegisterController {
    @Autowired
    private ExaminationRegistServiceImp examinationRegistServiceImp;
    @RequestMapping(value = "/ExaminationRegist",method = RequestMethod.GET)
    public AjaxResponse findallDrugRestration(){
        List<ExaminationRegistResult> examinationRegistResults = examinationRegistServiceImp.selectExRegistbyperson();
        return  AjaxResponse.success(examinationRegistResults );
    }
    @RequestMapping(value = "/ExaminationRegistBypage{page}/{size}",method = RequestMethod.GET)

    public AjaxResponse findallExaminationRegistBypage(@PathVariable("page") int page, @PathVariable("size") int size){
        log.info(String.valueOf(page));
        PageInfo<ExaminationRegistResult> selectlinkbyperson = examinationRegistServiceImp.selectlinkbyperson(page, size);
        return  AjaxResponse.success(selectlinkbyperson);
    }
    @RequestMapping(value = "/ExaminationRegistdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = examinationRegistServiceImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }

}

