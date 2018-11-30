package com.huayue.mybatisplus.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayue.mybatisplus.demo.mapper.PermissionMapper;
import com.huayue.mybatisplus.demo.model.Permission;
import com.huayue.mybatisplus.demo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 11:57
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findPermissionsByRoleId(int roleId) {
        return  permissionMapper.selectList(new QueryWrapper<Permission>().eq("role_id", roleId));
    }
}
