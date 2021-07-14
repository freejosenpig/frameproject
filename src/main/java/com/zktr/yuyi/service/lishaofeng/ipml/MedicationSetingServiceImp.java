package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.MedicationSetingDao;
import com.zktr.yuyi.entity.lishaofeng.MedicationSeting;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;
import com.zktr.yuyi.entity.lishaofeng.result.MedicationSetingsResult;
import com.zktr.yuyi.service.lishaofeng.MedicationSetingService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicationSetingServiceImp  implements MedicationSetingService {
    @Resource
    @Autowired
    private MedicationSetingDao medicationSetingDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer msId) {
        return medicationSetingDao.deleteByPrimaryKey(msId);
    }

    @Override
    public List<MedicationSetingsResult> selectMedSetingbyperson() {
        return medicationSetingDao.selectMedSetingbyperson();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(MedicationSeting record) {
        return medicationSetingDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<MedicationSetingsResult> selectMedSetingbypersonbypage(int page, int size){
        PageHelper.startPage(page, size);
        List<MedicationSetingsResult>medSetingbyperson =medicationSetingDao.selectMedSetingbyperson();
        PageInfo<MedicationSetingsResult> pageInfo = new PageInfo<>(medSetingbyperson);
        return pageInfo;
    }
}
