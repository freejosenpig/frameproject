package com.zktr.yuyi.dao.hedangren;

import com.zktr.yuyi.entity.hedangren.SysRoleMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SysRoleMenu)表数据库访问层
 *
 * @author hdr666
 * @since 2021-07-12 20:56:39
 */
@Mapper
public interface SysRoleMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    SysRoleMenu queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysRoleMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRoleMenu 实例对象
     * @return 对象列表
     */
    List<SysRoleMenu> queryAll(SysRoleMenu sysRoleMenu);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int insert(SysRoleMenu sysRoleMenu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleMenu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysRoleMenu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleMenu> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<SysRoleMenu> entities);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById(int id);

}

