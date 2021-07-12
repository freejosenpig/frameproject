package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;
import com.zktr.yuyi.service.lishaofeng.ipml.DrugRegistrationServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.AutomapConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class DrugReistrationController {
    @Autowired
    private DrugRegistrationServiceImp drugRegistrationServiceImp;
    @RequestMapping(value = "/DrugRestration",method = RequestMethod.GET)
    public AjaxResponse findallDrugRestration(){
        List<DrugRegResult> selectlinkbyperson = drugRegistrationServiceImp.selectlinkbyperson();
        return  AjaxResponse.success(selectlinkbyperson);
    }
    @RequestMapping(value = "/DrugRestrationByPage",method = RequestMethod.GET)

    public AjaxResponse findallDrugRestrationbypage(@PathVariable("page") int page,@PathVariable("size") int size) {
        log.info(String.valueOf(page));
        PageInfo<DrugRegResult> pageinfo = drugRegistrationServiceImp.selectlinkbyperson(page, size);
        return AjaxResponse.success(pageinfo);
    }


}
