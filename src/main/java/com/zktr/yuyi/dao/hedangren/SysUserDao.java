package com.zktr.yuyi.dao.hedangren;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    void update(SysUser sysUser);

    int deleteById(Integer id);

    SysUser login(String userName);

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> queryAll();

    /**
     * 多条件查询
     * @param user
     * @return
     */
    List<SysUser> queryAllByUser(SysUser user);
}