package com.zktr.yuyi.service.ipml.hedangren;

import com.zktr.yuyi.dao.hedangren.SysMenuDao;
import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.service.hedangren.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SysMenu)表服务实现类
 *
 * @author hdr666
 * @since 2021-07-11 19:25:21
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuDao sysMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMenu queryById(Integer id) {
        return this.sysMenuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMenu> queryAllByLimit(int offset, int limit) {
        return this.sysMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu insert(SysMenu sysMenu) {
        this.sysMenuDao.insert(sysMenu);
        return sysMenu;
    }

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(SysMenu sysMenu) {
        return this.sysMenuDao.update(sysMenu)>0?true:false;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysMenuDao.deleteById(id) > 0;
    }

    @Override
    public List<SysMenu> usermenu(int i) {
        return this.sysMenuDao.queryUserMenu(i);
    }

    @Override
    public List<SysMenu> queryUserMenu(Integer id) {
        return this.sysMenuDao.usermenu(id);
    }

    /**
     * 查询某角色所具有的菜单
     * @param roleId 角色id
     * @return
     */
    @Override
    public List<SysMenu> rolemenu(Integer roleId) {
        return this.sysMenuDao.rolemenu(roleId);
    }
}
