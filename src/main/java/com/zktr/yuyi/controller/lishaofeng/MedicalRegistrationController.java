package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;
import com.zktr.yuyi.service.lishaofeng.ipml.MedicalRegisterImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("service")
public class MedicalRegistrationController {
    @Autowired
    private MedicalRegisterImp medicalRegisterImp;

    @RequestMapping(value = "/medicalRegisterImp", method = RequestMethod.GET)
    public AjaxResponse findallmedicalRegister() {
        List<MedicalRegisterResult> medicalRegisterResults = medicalRegisterImp.selectMedicalbyperson();
        return AjaxResponse.success(medicalRegisterResults);
    }

    @RequestMapping(value = "/medicalRegisterImpByPage", method = RequestMethod.GET)

    public AjaxResponse findallRegisterImpByPage(@PathVariable("page") int page, @PathVariable("size") int size) {
        log.info(String.valueOf(page));
        PageInfo<MedicalRegisterResult> medicalRegisterResultPageInfo = medicalRegisterImp.selectMedicalbypersonbypage(page, size);
        return AjaxResponse.success(medicalRegisterResultPageInfo);
    }
    @RequestMapping(value = "/medicalRegisterdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = medicalRegisterImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
}
