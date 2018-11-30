package com.huayue.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 11:25
 */
@TableName("tbl_role")
@Getter
@Setter
public class Role {
    // 角色id
    @TableId("role_id")
    private int roleId;

    // 角色名称
    @TableField("role_name")
    private String roleName;

}
