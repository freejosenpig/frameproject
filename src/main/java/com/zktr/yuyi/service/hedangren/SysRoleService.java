package com.zktr.yuyi.service.hedangren;

import com.zktr.yuyi.entity.hedangren.SysRole;
import com.zktr.yuyi.entity.hedangren.SysRoleMenu;
import com.zktr.yuyi.entity.hedangren.SysUserRole;

import java.util.Collection;
import java.util.List;

/**
 * (SysRole)表服务接口
 *
 * @author hdr666
 * @since 2021-07-12 08:18:05
 */
public interface SysRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    SysRole insert(SysRole sysRole);

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    boolean update(SysRole sysRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<SysRole> queryAll();

    List<SysRole> queryAllByCondition(SysRole role);

    /**
     * 批量插入角色权限表记录
     * @param lists
     * @return
     */
    boolean insertBatch(List<SysRoleMenu> lists);

    List<SysUserRole> findtfhasuser(Integer id);

    boolean deletemenus(Integer id);

    List<SysRole> userhasrole(Integer id);
}
