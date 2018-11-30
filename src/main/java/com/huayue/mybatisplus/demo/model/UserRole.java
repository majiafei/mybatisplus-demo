package com.huayue.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 14:03
 */
@TableName("tbl_user_role")
@Data
public class UserRole {

    @TableId("user_role_id")
    private int userRoleId;

    @TableField("user_id")
    private int userId;

    @TableField("role_id")
    private int roleId;

}
