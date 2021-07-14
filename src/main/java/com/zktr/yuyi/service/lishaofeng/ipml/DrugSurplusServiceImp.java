package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.DrugSurplusDao;
import com.zktr.yuyi.entity.lishaofeng.DrugSurplus;
import com.zktr.yuyi.entity.lishaofeng.result.DrugSuplusResult;
import com.zktr.yuyi.entity.lishaofeng.result.DrugsDepositResult;
import com.zktr.yuyi.service.lishaofeng.DrugSurplusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DrugSurplusServiceImp implements DrugSurplusService {
    @Resource
    @Autowired
    private DrugSurplusDao drugSurplusDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer mesId) {
        return drugSurplusDao.deleteByPrimaryKey(mesId);
    }

    @Override
    public List<DrugSuplusResult> selectSurplusbyperson() {
        return drugSurplusDao.selectSurplusbyperson();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(DrugSurplus record) {
        return drugSurplusDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<DrugSuplusResult> selectlinkbyperson(int page, int size){
        PageHelper.startPage(page, size);
        List<DrugSuplusResult>drugsDepositResults = drugSurplusDao.selectSurplusbyperson();
        PageInfo<DrugSuplusResult> pageInfo = new PageInfo<>(drugsDepositResults);
        return pageInfo;
    }
}
