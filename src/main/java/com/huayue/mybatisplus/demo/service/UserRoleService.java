package com.huayue.mybatisplus.demo.service;

import com.huayue.mybatisplus.demo.model.UserRole;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 14:11
 */
public interface UserRoleService {

    List<UserRole> findUserRoleList(int userId);

}
