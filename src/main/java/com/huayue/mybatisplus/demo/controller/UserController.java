package com.huayue.mybatisplus.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/11/26 16:40
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getall")
    @ResponseBody
    public List<User> getAllUsers(Page<User> userPage){
        return userService.getAllUsers(userPage);
    }

}
