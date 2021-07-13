package com.zktr.yuyi.service.liangzheng;

import com.zktr.yuyi.dao.liangzheng.JdOldpeopleDao;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.liangzheng.JdOldpeople;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 老人档案
 */
@Service
public class JdOldpeopleServiceImpl implements JdOldpeopleService {
    @Resource
    private JdOldpeopleDao oldpeopleDao;

    @Resource
    private SysUserService sysUserService;

    @Override
    @Transactional
    public JdOldpeople insert(String addname, JdOldpeople record) {
        char[] chars = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int random = new Random().nextInt(20) + 1;
        // 创建 StringBuffer 进行拼接
        StringBuffer sb = new StringBuffer();
        for (int j = 0; j < random; j++) {
            int ret = new Random().nextInt(9);
            sb.append(chars[ret]);
        }
        String s = sb.toString();
        SysUser sysUser=sysUserService.login(addname);
        record.setOldpeopleAddname(sysUser.getId());
        record.setOldpeopleNumber(s);
        record.setOldpeopleAddtime(new Date());
        record.setOldpeopleStatus(0);
        oldpeopleDao.insert(record);
        return record;
    }

    @Override
    @Transactional
    public List<JdOldpeople> selectAllOldpeople() {
        return oldpeopleDao.selectAllOldpeople();
    }

    @Override
    @Transactional
    public JdOldpeople deleteOldpeople(JdOldpeople jdOldpeople) {
        oldpeopleDao.deleteOldpeople(jdOldpeople);
        return jdOldpeople;
    }

    @Override
    @Transactional
    public JdOldpeople updateOldpeople(JdOldpeople jdOldpeople) {
        oldpeopleDao.updateOldpeople(jdOldpeople);
        return jdOldpeople;
    }

    @Override
    @Transactional
    public JdOldpeople updateAccount(JdOldpeople jdOldpeople) {
        oldpeopleDao.updateAccount(jdOldpeople);
        return jdOldpeople;
    }

    @Override
    public JdOldpeople selectByPrimaryKey(Integer oldpeopleId) {
        return oldpeopleDao.selectByPrimaryKey(oldpeopleId);
    }
}
