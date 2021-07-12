package com.zktr.yuyi.vo;

import com.zktr.yuyi.entity.hedangren.SysMenu;
import lombok.Data;

import java.util.List;
@Data
public class SystemRoleMenuVo {
        private List<SysMenu> allmenus;
        private List<SysMenu> menus;
}
