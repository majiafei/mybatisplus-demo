package com.huayue.mybatisplus.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huayue.mybatisplus.demo.mapper.UserMapper;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
