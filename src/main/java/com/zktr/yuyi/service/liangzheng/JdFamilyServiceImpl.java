package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdFamilyDao;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdFamily;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JdFamilyServiceImpl implements JdFamilyService {

    @Resource
    private JdFamilyDao jdFamilyDao;

    @Resource
    private SysUserService sysUserService;

    @Override
    @Transactional
    public JdFamily insert(String addname, JdFamily record) {
        SysUser sysUser=sysUserService.login(addname);
        record.setFamilyAddname(sysUser.getId());
        record.setFamilyAddtime(new Date());
        jdFamilyDao.insert(record);
        return record;
    }

    @Override
    public List<JdFamily> selectAllFamily() {
        return jdFamilyDao.selectAllFamily();
    }

    @Override
    @Transactional
    public JdFamily deleteFamily(JdFamily jdFamily) {
        jdFamilyDao.deleteFamily(jdFamily);
        return jdFamily;
    }

    @Override
    @Transactional
    public JdFamily updateFamily(JdFamily jdFamily) {
        jdFamilyDao.updateFamily(jdFamily);
        return jdFamily;
    }
}
