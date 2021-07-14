package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.DrugRegistrationDao;
import com.zktr.yuyi.entity.lishaofeng.DrugRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;
import com.zktr.yuyi.service.lishaofeng.DrugRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DrugRegistrationServiceImp implements DrugRegistrationService {
    @Resource
    @Autowired
   private DrugRegistrationDao drugRegistrationDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer msgId) {
        return drugRegistrationDao.deleteByPrimaryKey(msgId);
    }

    @Override
    public List<DrugRegResult> selectlinkbyperson() {
        return drugRegistrationDao.selectlinkbyperson();
    }

    @Override

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(DrugRegistration record) {
        return drugRegistrationDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<DrugRegResult> selectlinkbyperson(int page,int size){
        PageHelper.startPage(page, size);
        List<DrugRegResult> drugRegResults = drugRegistrationDao.selectlinkbyperson();
        PageInfo<DrugRegResult> pageInfo = new PageInfo<>(drugRegResults);
        return pageInfo;
    }
}
