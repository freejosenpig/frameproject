package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.ExaminationRegisterDao;
import com.zktr.yuyi.entity.lishaofeng.ExaminationRegister;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;
import com.zktr.yuyi.service.lishaofeng.ExaminationRegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExaminationRegistServiceImp implements ExaminationRegistService {
    @Resource
    @Autowired
    private ExaminationRegisterDao examinationRegisterDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer erId) {
        return examinationRegisterDao.deleteByPrimaryKey(erId);
    }

    @Override
    public List<ExaminationRegistResult> selectExRegistbyperson() {
        return examinationRegisterDao.selectExRegistbyperson();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(ExaminationRegister record) {
        return examinationRegisterDao.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int insertSelective(ExaminationRegister record) {
        return examinationRegisterDao.insertSelective(record);
    }

    public PageInfo<ExaminationRegistResult> selectlinkbyperson(int page, int size){
        PageHelper.startPage(page, size);
        List<ExaminationRegistResult>drugsDepositResults = examinationRegisterDao.selectExRegistbyperson();
        PageInfo<ExaminationRegistResult> pageInfo = new PageInfo<>(drugsDepositResults);
        return pageInfo;
    }
}
