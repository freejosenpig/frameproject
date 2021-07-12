package com.zktr.yuyi.entity.hedangren;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (SysMenu)实体类
 *
 * @author hdr666
 * @since 2021-07-11 15:19:25
 */
@Data
public class SysMenu implements Serializable {
    private static final long serialVersionUID = -61538165657699481L;
    /**
     * 系统菜单id
     */
    private Integer id;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 菜单排序
     */
    private Integer orderNum;
    /**
     * 菜单类型（M目录，C菜单，F：按钮）
     */
    private String menuType;
    /**
     * 路由地址
     */
    private String path;
    /**
     * 路由名
     */
    private String name;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 权限标识
     */
    private String perms;
    /**
     * 菜单状态（0隐藏、显示）
     */
    private Integer visible;
    /**
     * 组件路径
     */
    private String component;

    private List<SysMenu> childMenu;
}
