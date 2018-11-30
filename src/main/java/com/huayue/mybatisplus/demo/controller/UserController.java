package com.huayue.mybatisplus.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayue.mybatisplus.demo.common.ShiroFactory;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
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

    @RequestMapping("/login")
    @ResponseBody
    public String login (String userName, String userPass) {
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userName, userPass);
            SecurityUtils.getSubject().login(usernamePasswordToken);
        }catch (UnknownAccountException e){
            e.printStackTrace();
            return "login";
        }catch (IncorrectCredentialsException exception) {
            exception.printStackTrace();
            return "login";
        }

        User shiroUser = ShiroFactory.getShiroUser();

        return "index";
    }

}
