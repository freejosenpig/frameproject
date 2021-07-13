package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdHealthDao;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdHealth;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JdHealthServiceImpl implements JdHealthService {
    @Resource
    private JdHealthDao healthDao;

    @Resource
    private SysUserService sysUserService;

    @Override
    @Transactional
    public JdHealth insert(String addname, JdHealth record) {
        SysUser sysUser=sysUserService.login(addname);
        record.setHealthAddname(sysUser.getId());
        record.setHealthAddtime(new Date());
        healthDao.insert(record);
        return record;
    }

    @Override
    public List<JdHealth> selectAllHealth() {
        return healthDao.selectAllHealth();
    }

    @Override
    @Transactional
    public JdHealth deleteHealth(JdHealth jdHealth) {
        healthDao.deleteHealth(jdHealth);
        return jdHealth;
    }

    @Override
    @Transactional
    public JdHealth updateHealth(JdHealth jdHealth) {
        healthDao.updateHealth(jdHealth);
        return jdHealth;
    }
}
