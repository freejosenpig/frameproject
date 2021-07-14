package com.zktr.yuyi.service.lishaofeng.ipml;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zktr.yuyi.dao.lishaofeng.MedicalRegistrationDao;
import com.zktr.yuyi.entity.lishaofeng.MedicalRegistration;
import com.zktr.yuyi.entity.lishaofeng.result.HealthindexResult;
import com.zktr.yuyi.entity.lishaofeng.result.MedicalRegisterResult;
import com.zktr.yuyi.service.lishaofeng.MedicalRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicalRegisterImp  implements MedicalRegisterService {
    @Resource
    @Autowired
    private MedicalRegistrationDao medicalRegistrationDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int deleteByPrimaryKey(Integer mrId) {
        return medicalRegistrationDao.deleteByPrimaryKey(mrId);
    }

    @Override
    public List<MedicalRegisterResult> selectMedicalbyperson() {
        return medicalRegistrationDao.selectMedicalbyperson();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int updateByPrimaryKeySelective(MedicalRegistration record) {
        return medicalRegistrationDao.updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public int insertSelective(MedicalRegistration record) {
        return medicalRegistrationDao.insertSelective(record);
    }

    public PageInfo<MedicalRegisterResult>selectMedicalbypersonbypage(int page, int size){
        PageHelper.startPage(page, size);
        List<MedicalRegisterResult>medicalRegisterResults =medicalRegistrationDao.selectMedicalbyperson();
        PageInfo<MedicalRegisterResult> pageInfo = new PageInfo<>(medicalRegisterResults);
        return pageInfo;
    }
}
