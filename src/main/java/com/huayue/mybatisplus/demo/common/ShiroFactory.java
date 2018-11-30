package com.huayue.mybatisplus.demo.common;

import com.huayue.mybatisplus.demo.model.User;
import org.apache.shiro.SecurityUtils;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 15:01
 */
public class ShiroFactory {

    public static User getShiroUser() {
        return (User) SecurityUtils.getSubject().getPrincipal();
    }

}
