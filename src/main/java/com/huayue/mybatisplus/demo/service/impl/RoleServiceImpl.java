package com.huayue.mybatisplus.demo.service.impl;

import com.huayue.mybatisplus.demo.mapper.RoleMapper;
import com.huayue.mybatisplus.demo.model.Role;
import com.huayue.mybatisplus.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 11:44
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role findRole(int roleId) {
        return roleMapper.selectById(roleId);
    }
}
