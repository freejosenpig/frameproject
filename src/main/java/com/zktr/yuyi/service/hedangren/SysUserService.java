package com.zktr.yuyi.service.hedangren;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;

import java.util.List;

/**
 * (SysUser)表服务接口
 *
 * @author hdr666
 * @since 2021-07-11 15:27:54
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(Integer id);



    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 账户密码登录
     * @param userName 用户账户
     * @return 实列对象
     */
    SysUser login(String userName);

    List<SysMenu> usermenu(Integer id);
}
