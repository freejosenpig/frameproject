package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdOffDao;
import com.zktr.yuyi.entity.cost.CostBack;
import com.zktr.yuyi.entity.cost.CostEntryfees;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdOff;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.cost.CostBackService;
import com.zktr.yuyi.service.cost.CostEntryfeesService;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class JdOffServiceImpl implements JdOffService {
    @Resource
    private JdOffDao jdOffDao;

    @Resource
    private JdOldpeopleService jdOldpeopleService;

    @Resource
    private CostBackService costBackService;

    @Resource
    private SysUserService sysUserService;

    @Override
    @Transactional
    public JdOff insert(String addname,JdOff record) {
        SysUser sysUser=sysUserService.login(addname);
        JdOldpeople jdOldpeople=jdOldpeopleService.selectByPrimaryKey(record.getOffOrdid());
        CostBack costBack=new CostBack();
        costBack.setOldpeopleId(jdOldpeople.getOldpeopleId());
        Long money = jdOldpeople.getOldpeopleAccount();
        if(money>0){
            costBack.setBackMoney(money);
        }else{
            int money2= Math.toIntExact(money);
            int money3 = -(money2);
            Long money4 = Long.valueOf(money3);
            costBack.setBackEntryfeesMoney(money4);
        }
        costBack.setBackTime(record.getOffTime());
        costBackService.insertcostback(costBack);
        record.setOffBackid(costBack.getBackId());
        record.setOffAddname(sysUser.getId());
        record.setOffAddtime(new Date());
        jdOffDao.insert(record);
        return record;
    }

    @Override
    @Transactional
    public JdOff updateOff(JdOff jdOff) {
        jdOffDao.updateOff(jdOff);
        return jdOff;
    }

    @Override
    @Transactional
    public JdOff deleteOff(JdOff jdOff) {
        jdOffDao.deleteOff(jdOff);
        return jdOff;
    }

    @Override
    public List<JdOff> selectAllOff() {
        return jdOffDao.selectAllOff();
    }
}
