package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;
import com.zktr.yuyi.entity.lishaofeng.result.MedicationSetingsResult;
import com.zktr.yuyi.service.lishaofeng.ipml.MedicationSetingServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class MedicaSetingController {
    @Autowired
    private MedicationSetingServiceImp medicationSetingServiceImp;
    @RequestMapping(value = "/medicaSetingImp",method = RequestMethod.GET)
    public AjaxResponse findallmedicaSeting(){
        List<MedicationSetingsResult> medSetingbyperson = medicationSetingServiceImp.selectMedSetingbyperson();
        return  AjaxResponse.success(medSetingbyperson);
    }
    @RequestMapping(value = "/medicaSetingImpPage/{page}/{size}",method = RequestMethod.GET)

    public AjaxResponse findallmedicaSetingImpByPage(@PathVariable("page") int page, @PathVariable("size") int size){
        log.info(String.valueOf(page));
        PageInfo<MedicationSetingsResult> medicationSetingsResultPageInfo = medicationSetingServiceImp.selectMedSetingbypersonbypage(page, size);
        return  AjaxResponse.success(medicationSetingsResultPageInfo);
    }
}
