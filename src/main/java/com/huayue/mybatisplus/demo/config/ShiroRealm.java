package com.huayue.mybatisplus.demo.config;

import com.huayue.mybatisplus.demo.model.Permission;
import com.huayue.mybatisplus.demo.model.Role;
import com.huayue.mybatisplus.demo.model.User;
import com.huayue.mybatisplus.demo.model.UserRole;
import com.huayue.mybatisplus.demo.service.PermissionService;
import com.huayue.mybatisplus.demo.service.RoleService;
import com.huayue.mybatisplus.demo.service.UserRoleService;
import com.huayue.mybatisplus.demo.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 自定义权限匹配和账号密码匹配
 * @Auther: Administrator
 * @Date: 2018/11/28 14:35
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private UserRoleService userRoleService;

    //角色权限和对应权限添加
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        User user= (User) principalCollection.getPrimaryPrincipal();

        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        List<UserRole> userRoleList = userRoleService.findUserRoleList(user.getUserId());

        // 给用户添加角色
        for (UserRole userRole : userRoleList) {
            Role role = roleService.findRole(userRole.getRoleId());
            simpleAuthorizationInfo.addRole(role.getRoleName());
        }

        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
       String  userName = (String) token.getPrincipal();
       // 根据用户名称查询用户
        User user = userService.findByName(userName);

        if (user == null) {
            throw new UnknownAccountException();
        }

        // 创建SimpleAuthenticationInfo对象，并且把username和password等信息封装到里面
        // 用户密码的比对是Shiro帮我们完成的
        SimpleAuthenticationInfo info = null;
        info = new SimpleAuthenticationInfo(user, user.getUserPassword(), ByteSource.Util.bytes(userName), getName());

        return info;
    }
}
