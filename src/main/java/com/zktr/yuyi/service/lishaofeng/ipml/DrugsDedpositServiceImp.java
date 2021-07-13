package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.DrugsDepositDao;
import com.zktr.yuyi.entity.lishaofeng.DrugsDeposit;
import com.zktr.yuyi.entity.lishaofeng.result.DrugRegResult;
import com.zktr.yuyi.entity.lishaofeng.result.DrugsDepositResult;
import com.zktr.yuyi.service.lishaofeng.DrugsDedpositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DrugsDedpositServiceImp  implements DrugsDedpositService {
    @Resource
    @Autowired
    private DrugsDepositDao drugsDepositDao;

    @Override
    public int deleteByPrimaryKey(Integer ddId) {
        return drugsDepositDao.deleteByPrimaryKey(ddId);
    }

    @Override
    public List<DrugsDepositResult> selectDepositbyperson() {
        return drugsDepositDao.selectDepositbyperson();
    }

    @Override
    public int updateByPrimaryKeySelective(DrugsDeposit record) {
        return drugsDepositDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<DrugsDepositResult> selectlinkbyperson(int page, int size){
        PageHelper.startPage(page, size);
        List<DrugsDepositResult>drugsDepositResults = drugsDepositDao.selectDepositbyperson();
        PageInfo<DrugsDepositResult> pageInfo = new PageInfo<>(drugsDepositResults);
        return pageInfo;
    }


}
