package com.zktr.yuyi.service.ipml.hedangren;

import com.zktr.yuyi.dao.hedangren.SysMenuDao;
import com.zktr.yuyi.dao.hedangren.SysUserDao;
import com.zktr.yuyi.dao.hedangren.SysUserRoleDao;
import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import com.zktr.yuyi.entity.hedangren.SysUserRole;
import com.zktr.yuyi.service.hedangren.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author hdr666
 * @since 2021-07-11 15:28:26
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;
    @Resource
    private SysMenuDao menuDao;
    @Resource
    private SysUserRoleDao userRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Integer id) {
        return this.sysUserDao.selectByPrimaryKey(id);
    }

    /**
     * @return
     */
    @Override
    public List<SysUser> queryAll() {
        return this.sysUserDao.queryAll();
    }


    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        int i = this.sysUserDao.insert(sysUser);
        return i>0?sysUser:null;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysUserDao.deleteById(id) > 0;
    }

    @Override
    public SysUser login(String userName) {
        return this.sysUserDao.login(userName);
    }

    @Override
    public List<SysMenu> usermenu(Integer id) {
        return this.menuDao.usermenu(id);
    }

    @Override
    public List<SysUser> queryAllByUser(SysUser user) {
        return this.sysUserDao.queryAllByUser(user);
    }

    /**
     * 根据用户id删除用户角色
     * @param id
     * @return
     */
    @Override
    public boolean deleteroles(Integer id) {
        return userRoleDao.deleteById(id)>0?true:false;
    }

    /**
     * 批量新增用户角色
     * @param lists
     * @return
     */
    @Override
    public boolean insertBatch(List<SysUserRole> lists) {
        return this.userRoleDao.insertBatch(lists)>0?true:false;
    }

    /**
     * 查询最大的id
     * @return
     */
    @Override
    public int selectmaxid() {
        return this.sysUserDao.selectmaxid();
    }
}
