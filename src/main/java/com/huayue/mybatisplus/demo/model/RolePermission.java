package com.huayue.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 14:04
 */
@TableName("tbl_role_permission")
@Getter
@Setter
public class RolePermission {

    @TableId("role_permission_id")
    private int rolePermissionId;

    @TableField("role_id")
    private int roleId;

    @TableField("permission_id")
    private int permissionId;

}
