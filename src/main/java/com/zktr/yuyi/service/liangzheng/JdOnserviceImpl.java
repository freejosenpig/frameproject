package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdOnDao;
import com.zktr.yuyi.entity.cost.CostEntryfees;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdOn;
import com.zktr.yuyi.service.cost.CostEntryfeesService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JdOnserviceImpl implements JdOnservice {
    @Resource
    private JdOnDao jdOnDao;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private CostEntryfeesService costEntryfeesService;

    @Override
    @Transactional
    public JdOn insert(String addname,JdOn record) {
        SysUser sysUser=sysUserService.login(addname);
        record.setOnAddname(sysUser.getId());
        record.setOnAddtime(new Date());
        jdOnDao.insert(record);
        CostEntryfees costEntryfees=new CostEntryfees();
        costEntryfees.setEntryfeesMoney(record.getOnmoney());
        costEntryfees.setEntryfeesExplain("入住缴费");
        costEntryfees.setEntryfeesOpid(record.getOnOldid());
        costEntryfeesService.insertentryfees(costEntryfees);
        return record;
    }

    @Override
    public List<JdOn> selectAllON() {
        return jdOnDao.selectAllON();
    }

    @Override
    @Transactional
    public JdOn deleteOn(JdOn jdOn) {
        jdOnDao.deleteOn(jdOn);
        return jdOn;
    }

    @Override
    @Transactional
    public JdOn updateOn(JdOn jdOn) {
        jdOnDao.updateOn(jdOn);
        return jdOn;
    }
}
