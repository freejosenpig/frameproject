package com.zktr.yuyi.service.hedangren;

import com.zktr.yuyi.entity.hedangren.SysMenu;

import java.util.List;

/**
 * (SysMenu)表服务接口
 *
 * @author hdr666
 * @since 2021-07-11 19:24:59
 */
public interface SysMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysMenu queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    SysMenu insert(SysMenu sysMenu);

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    boolean update(SysMenu sysMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    /**
     * 查询有所的权限菜单
     * @param i
     * @return
     */
    List<SysMenu> usermenu(int i);

    List<SysMenu> queryUserMenu(Integer id);

    /**
     *查询某角色所具有的菜单
     * @param roleId 角色id
     * @return 实列对象
     */
    List<SysMenu> rolemenu(Integer roleId);
}
