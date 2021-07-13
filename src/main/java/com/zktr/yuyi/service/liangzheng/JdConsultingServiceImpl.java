package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdConsultingDao;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdConsulting;
import com.zktr.yuyi.service.hedangren.SysUserService;
import com.zktr.yuyi.service.liangzheng.JdConsultingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class JdConsultingServiceImpl implements JdConsultingService {

    @Resource
    private JdConsultingDao consultingDao;

    @Resource
    private SysUserService sysUserService;

    @Override
    public List<JdConsulting> selectAllConsulting() {
        return consultingDao.selectAllConsulting();
    }

    @Override
    @Transactional
    public JdConsulting insertConsulting(String addname,JdConsulting consulting) {
        SysUser sysUser=sysUserService.login(addname);
        consulting.setConsultingAddname(sysUser.getId());
        consulting.setConsultingAddtime(new Date());
        consultingDao.insertConsulting(consulting);
        return consulting;
    }

    @Override
    @Transactional
    public JdConsulting updateConsulting(JdConsulting consulting) {
        consultingDao.updateConsulting(consulting);
        return consulting;
    }

    @Override
    @Transactional
    public JdConsulting deleteConsulting(JdConsulting consulting) {
        consultingDao.deleteConsulting(consulting);
        return consulting;
    }

    @Override
    public JdConsulting selectConsultingById(Integer id) {
        return consultingDao.selectConsultingById(id);
    }
}
