package com.zktr.yuyi.service.ipml.hedangren;

import com.zktr.yuyi.dao.hedangren.SysUserRoleDao;
import com.zktr.yuyi.entity.hedangren.SysUserRole;
import com.zktr.yuyi.service.hedangren.SysUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUserRole)表服务实现类
 *
 * @author hdr666
 * @since 2021-07-11 16:45:49
 */
@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Resource
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public SysUserRole queryRoleIdbyUserId(int id) {
        return this.sysUserRoleDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserRole> queryAllByLimit(int offset, int limit) {
        return this.sysUserRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserRole insert(SysUserRole sysUserRole) {
        this.sysUserRoleDao.insert(sysUserRole);
        return sysUserRole;
    }


    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.sysUserRoleDao.deleteById() > 0;
    }
}
