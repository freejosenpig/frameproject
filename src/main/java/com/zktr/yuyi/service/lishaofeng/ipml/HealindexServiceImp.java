package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.HealthIndexDao;
import com.zktr.yuyi.entity.lishaofeng.HealthIndex;
import com.zktr.yuyi.entity.lishaofeng.result.ExaminationRegistResult;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;
import com.zktr.yuyi.service.lishaofeng.HealindexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class HealindexServiceImp  implements HealindexService {
    @Resource
    @Autowired
    private HealthIndexDao healthIndexDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer hrId) {
        return healthIndexDao.deleteByPrimaryKey(hrId);
    }

    @Override
    public List<HealthindexResult> selectHealthbyperson() {
        return healthIndexDao.selectHealthbyperson();
    }

    @Override

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(HealthIndex record) {
        return healthIndexDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<HealthindexResult> selectHealthbypersonpage(int page, int size){
        PageHelper.startPage(page, size);
        List<HealthindexResult>healthindexResults = healthIndexDao.selectHealthbyperson();
        PageInfo<HealthindexResult> pageInfo = new PageInfo<>(healthindexResults);
        return pageInfo;
    }
}
