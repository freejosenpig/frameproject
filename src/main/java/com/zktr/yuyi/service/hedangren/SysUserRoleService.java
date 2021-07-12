package com.zktr.yuyi.service.hedangren;



import com.zktr.yuyi.entity.hedangren.SysUserRole;

import java.util.List;

/**
 * (SysUserRole)表服务接口
 *
 * @author hdr666
 * @since 2021-07-11 16:45:12
 */
public interface SysUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    SysUserRole queryRoleIdbyUserId(int id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserRole 实例对象
     * @return 实例对象
     */
    SysUserRole insert(SysUserRole sysUserRole);



    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    boolean deleteById();

}
