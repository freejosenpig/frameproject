package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.ExaminationRegister;
import com.zktr.yuyi.entity.lishaofeng.MedicalRegistration;
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
    //查询
    @RequestMapping(value = "/medicalRegisterImp", method = RequestMethod.GET)
    public AjaxResponse findallmedicalRegister() {
        List<MedicalRegisterResult> medicalRegisterResults = medicalRegisterImp.selectMedicalbyperson();
        return AjaxResponse.success(medicalRegisterResults);
    }
    //分页
    @RequestMapping(value = "/medicalRegisterImpByPage", method = RequestMethod.GET)
    public AjaxResponse findallRegisterImpByPage(@PathVariable("page") int page, @PathVariable("size") int size) {
        log.info(String.valueOf(page));
        PageInfo<MedicalRegisterResult> medicalRegisterResultPageInfo = medicalRegisterImp.selectMedicalbypersonbypage(page, size);
        return AjaxResponse.success(medicalRegisterResultPageInfo);
    }
    //分页
    @RequestMapping(value = "/medicalRegisterdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = medicalRegisterImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
    //修改
    @RequestMapping(value = "/medicalRegisterUpdate",method = RequestMethod.POST)
    public AjaxResponse delectbypage(@RequestBody MedicalRegistration medicalRegistration) {
        medicalRegistration.getMrId();
        MedicalRegistration medicalRegistration1=new MedicalRegistration();
        medicalRegistration1.setMrId(medicalRegistration.getMrId());
        medicalRegistration1.setDoctor(medicalRegistration1.getDoctor());
        medicalRegistration1.setDiagnosisResults(medicalRegistration.getDoctor());
        medicalRegistration1.setMedicalAdress(medicalRegistration.getMedicalAdress());
        medicalRegistration1.setMedicalAdvice(medicalRegistration.getMedicalAdvice());
        int i = medicalRegisterImp.updateByPrimaryKeySelective(medicalRegistration1);
        return AjaxResponse.success(i);
    }
    //添加
    @RequestMapping(value = "/MedicalRegistrationInsert",method = RequestMethod.POST)
    public AjaxResponse InsertMedicalRegistration(@RequestBody MedicalRegistration medicalRegistration) {

        MedicalRegistration medicalRegistration1=new MedicalRegistration();
        medicalRegistration1.setId(medicalRegistration.getId());

        medicalRegistration1.setDoctor(medicalRegistration.getDoctor());
        medicalRegistration1.setDiagnosisResults(medicalRegistration.getDiagnosisResults());
        medicalRegistration1.setMedicalAdress(medicalRegistration.getMedicalAdress());
        medicalRegistration1.setMedicalAdvice(medicalRegistration.getMedicalAdvice());
        int i = medicalRegisterImp.insertSelective(medicalRegistration1);
        return AjaxResponse.success(i);
    }
}

