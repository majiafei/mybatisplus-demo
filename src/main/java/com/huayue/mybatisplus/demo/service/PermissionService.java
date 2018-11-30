package com.huayue.mybatisplus.demo.service;

import com.huayue.mybatisplus.demo.model.Permission;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 11:51
 */
public interface PermissionService {

    /**
     * 某角色所拥有的权限
     * @param roleId
     * @return
     */
    List<Permission> findPermissionsByRoleId(int roleId);

}
