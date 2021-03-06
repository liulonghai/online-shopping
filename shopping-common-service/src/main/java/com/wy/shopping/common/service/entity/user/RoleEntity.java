package com.wy.shopping.common.service.entity.user;

import lombok.*;

import java.util.List;

/**
 * @author wy
 * @description
 * @date 2019-05-10
 */
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleEntity {
    /**
     * 主键
     */
    private String id;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String desc;

    /**
     * 该角色能访问的菜单
     */
    private List<MenuEntity> menuList;

    /**
     * 该角色拥有的权限
     */
    private List<PermissionEntity> permissionList;
}
