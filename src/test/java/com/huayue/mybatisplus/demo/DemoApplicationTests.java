package com.huayue.mybatisplus.demo;

import com.huayue.mybatisplus.demo.mapper.PermissionMapper;
import com.huayue.mybatisplus.demo.mapper.RoleMapper;
import com.huayue.mybatisplus.demo.mapper.UserMapper;
import com.huayue.mybatisplus.demo.mapper.UserRoleMapper;
import com.huayue.mybatisplus.demo.model.Role;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.model.UserRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setUserName("小明");
        user.setUserPassword("1111");
        int i = userMapper.insert(user);

        System.out.println(i);
    }

    @Test
    public void testSaveRole() {
        Role role = new Role();
        role.setRoleName("admin");
        roleMapper.insert(role);

        Role role1 = new Role();
        role1.setRoleName("middle");
        roleMapper.insert(role1);

        Role role2= new Role();
        role2.setRoleName("hign");
        roleMapper.insert(role2);
    }

    @Test
    public void testSaveUserRole() {

        UserRole userRole1 = new UserRole();
        userRole1.setUserRoleId(2);
        userRole1.setRoleId(2);
        userRole1.setUserId(1);
        userRoleMapper.insert(userRole1);

        UserRole userRole2 = new UserRole();
        userRole2.setUserRoleId(3);
        userRole2.setRoleId(2);
        userRole2.setUserId(1);
        userRoleMapper.insert(userRole2);

    }

}
