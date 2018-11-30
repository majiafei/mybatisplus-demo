package com.huayue.mybatisplus.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huayue.mybatisplus.demo.mapper.UserRoleMapper;
import com.huayue.mybatisplus.demo.model.UserRole;
import com.huayue.mybatisplus.demo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 14:11
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<UserRole> findUserRoleList(int userId) {
        return userRoleMapper.selectList(new QueryWrapper<UserRole>().eq("user_id", userId));
    }
}
