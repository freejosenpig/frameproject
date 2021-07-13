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

import javax.annotation.Resource;
import java.util.List;
@Service
public class HealindexServiceImp  implements HealindexService {
    @Resource
    @Autowired
    private HealthIndexDao healthIndexDao;

    @Override
    public int deleteByPrimaryKey(Integer hrId) {
        return healthIndexDao.deleteByPrimaryKey(hrId);
    }

    @Override
    public List<HealthindexResult> selectHealthbyperson() {
        return healthIndexDao.selectHealthbyperson();
    }

    @Override
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
