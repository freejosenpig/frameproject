package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.DrugRegistration;
import com.zktr.yuyi.entity.lishaofeng.DrugsDeposit;
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
@RequestMapping("service")
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
    @RequestMapping(value = "/Drugdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = drugRegistrationServiceImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
    @RequestMapping(value = "/DrugRestrationupdate",method = RequestMethod.POST)
    public AjaxResponse delectbypage(@RequestBody DrugRegistration drugRegistration) {
        drugRegistration.getMsgId();
        log.info(String.valueOf(drugRegistration.getMsgId()));
        log.info(drugRegistration.getDrugstype());
        DrugRegistration drugRegistration1=new DrugRegistration();
        drugRegistration1.setDrugstype(drugRegistration.getDrugstype());
        drugRegistration1.setMtime(drugRegistration.getMtime());
        drugRegistration1.setRtime(drugRegistration.getRtime());
        drugRegistration1.setMsgId(drugRegistration.getMsgId());
        String dgname = drugRegistration1.getDrugstype();
        log.info(dgname);

        int ok = drugRegistrationServiceImp.updateByPrimaryKeySelective(drugRegistration1);
        return AjaxResponse.success(ok);
    }





}
