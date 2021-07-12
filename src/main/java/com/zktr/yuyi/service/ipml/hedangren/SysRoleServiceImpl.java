package com.zktr.yuyi.service.ipml.hedangren;

import com.zktr.yuyi.dao.hedangren.SysRoleDao;
import com.zktr.yuyi.dao.hedangren.SysRoleMenuDao;
import com.zktr.yuyi.entity.hedangren.SysRole;
import com.zktr.yuyi.entity.hedangren.SysRoleMenu;
import com.zktr.yuyi.service.hedangren.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysRole)表服务实现类
 *
 * @author hdr666
 * @since 2021-07-12 08:18:49
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysRoleMenuDao roleMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRole queryById(Integer id) {
        return this.sysRoleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRole> queryAllByLimit(int offset, int limit) {
        return this.sysRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole insert(SysRole sysRole) {
        this.sysRoleDao.insert(sysRole);
        return sysRole;
    }

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole update(SysRole sysRole) {
        this.sysRoleDao.update(sysRole);
        return this.queryById(sysRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysRoleDao.deleteById(id) > 0;
    }

    /**
     * 查询所有角色
     * @return
     */
    @Override
    public List<SysRole> queryAll() {
        return this.sysRoleDao.queryAll(new SysRole());
    }

    @Override
    public List<SysRole> queryAllByCondition(SysRole role) {
        return this.sysRoleDao.queryAll(role);
    }

    @Override
    public boolean insertBatch(List<SysRoleMenu> lists) {
        return this.roleMenuDao.insertBatch(lists)>0?true:false;
    }
}
