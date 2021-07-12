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

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExaminationRegistServiceImp implements ExaminationRegistService {
    @Resource
    @Autowired
    private ExaminationRegisterDao examinationRegisterDao;
    @Override
    public List<ExaminationRegistResult> selectExRegistbyperson() {
        return examinationRegisterDao.selectExRegistbyperson();
    }

    @Override
    public int updateByPrimaryKeySelective(ExaminationRegister record) {
        return examinationRegisterDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<ExaminationRegistResult> selectlinkbyperson(int page, int size){
        PageHelper.startPage(page, size);
        List<ExaminationRegistResult>drugsDepositResults = examinationRegisterDao.selectExRegistbyperson();
        PageInfo<ExaminationRegistResult> pageInfo = new PageInfo<>(drugsDepositResults);
        return pageInfo;
    }
}
