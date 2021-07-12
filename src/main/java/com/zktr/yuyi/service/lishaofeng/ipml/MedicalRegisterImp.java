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

import javax.annotation.Resource;
import java.util.List;
@Service
public class MedicalRegisterImp  implements MedicalRegisterService {
    @Resource
    @Autowired
    private MedicalRegistrationDao medicalRegistrationDao;
    @Override
    public List<MedicalRegisterResult> selectMedicalbyperson() {
        return medicalRegistrationDao.selectMedicalbyperson();
    }

    @Override
    public int updateByPrimaryKeySelective(MedicalRegistration record) {
        return medicalRegistrationDao.updateByPrimaryKeySelective(record);
    }

    public PageInfo<MedicalRegisterResult>selectMedicalbypersonbypage(int page, int size){
        PageHelper.startPage(page, size);
        List<MedicalRegisterResult>medicalRegisterResults =medicalRegistrationDao.selectMedicalbyperson();
        PageInfo<MedicalRegisterResult> pageInfo = new PageInfo<>(medicalRegisterResults);
        return pageInfo;
    }
}
