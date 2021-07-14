package com.zktr.yuyi.controller.lishaofeng;

import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.entity.lishaofeng.DrugsDeposit;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;
import com.zktr.yuyi.entity.lishaofeng.result.DrugsDepositResult;
import com.zktr.yuyi.service.lishaofeng.ipml.DrugsDedpositServiceImp;
import com.zktr.yuyi.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("service")
@EnableSwagger2
@Slf4j
public class DruDepositController {
    @Autowired
    private DrugsDedpositServiceImp drugsDedpositServiceImp;
    //查询
    @RequestMapping(value = "/DrugDedposit",method = RequestMethod.GET)
    public AjaxResponse findallDrugRestration(){
        List<DrugsDepositResult> drugsDepositResults = drugsDedpositServiceImp.selectDepositbyperson();
        return  AjaxResponse.success(drugsDepositResults);
    }
    //分页
    @RequestMapping(value = "/DrugDedpositByPage/{page}/{size}",method = RequestMethod.GET)
    public AjaxResponse findallDrugDedpositByPage(@PathVariable("page") int page, @PathVariable("size") int size){
        log.info(String.valueOf(page));
        PageInfo<DrugsDepositResult> depositResultPageInfo = drugsDedpositServiceImp.selectlinkbyperson(page, size);
        return  AjaxResponse.success(depositResultPageInfo);
    }
    //分页查询
    @RequestMapping(value = "/DrugDedpositByPage/",method = RequestMethod.POST)
    public AjaxResponse findallDrugDedpositByPageandName(@RequestBody Map map){
        Object page = map.get("page");
        Object size = map.get("size");
        Object name =map.get("name");
        int page1 = Integer.parseInt(String.valueOf(page));
        int size1 = Integer.parseInt(String.valueOf(size));
        String name1=String.valueOf(name);
        PageInfo<DrugsDepositResult> depositResultPageInfo = drugsDedpositServiceImp.selectlinkbyperson(page1,size1);
        return  AjaxResponse.success(depositResultPageInfo);
    }
    //根据id删除
    @RequestMapping(value = "/DrugDedpositdelectbyid/{id}",method = RequestMethod.DELETE)
    public AjaxResponse delectbypage(@PathVariable("id") int id) {
        int i = drugsDedpositServiceImp.deleteByPrimaryKey(id);
        return AjaxResponse.success(i);
    }
    //修改
    @RequestMapping(value = "/DrugDedpositupdate",method = RequestMethod.POST)
    public AjaxResponse delectbypage(@RequestBody DrugsDeposit drugsDeposit) {

        drugsDeposit.getDdId();
        log.info(String.valueOf(drugsDeposit.getDdId()));
        DrugsDeposit deposit=new DrugsDeposit();
        deposit.setDgname(drugsDeposit.getDgname());
        deposit.setMunit(drugsDeposit.getMunit());
        deposit.setPaymentmethod(drugsDeposit.getPaymentmethod());
        deposit.setNumber(drugsDeposit.getNumber());
        deposit.setDdId(drugsDeposit.getDdId());
        String dgname = deposit.getDgname();
        log.info(dgname);

        int ok = drugsDedpositServiceImp.updateByPrimaryKeySelective(deposit);
        return AjaxResponse.success(ok);
    }
}
