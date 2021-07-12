package com.zktr.yuyi.vo;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import com.zktr.yuyi.entity.hedangren.SysUser;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private SysUser user;
    private List<SysMenu> menus;
    private boolean validate;
}