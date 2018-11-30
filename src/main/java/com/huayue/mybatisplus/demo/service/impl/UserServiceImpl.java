package com.huayue.mybatisplus.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huayue.mybatisplus.demo.mapper.UserMapper;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 16:34
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers(IPage<User> page) {
        IPage<User> userIPage = userMapper.selectPage(page, null);
        return userIPage.getRecords();
    }

    /**
     * 根据用户名称查询用户
     * @param name
     * @return
     */
    @Override
    public User findByName(String name) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("user_name", name));
        return user;
    }
}
