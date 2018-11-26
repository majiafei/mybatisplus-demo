package com.huayue.mybatisplus.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.huayue.mybatisplus.demo.model.User;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 16:34
 */
public interface UserService {

    List<User> getAllUsers(IPage<User> page);

}
