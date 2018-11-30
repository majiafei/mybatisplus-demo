package com.huayue.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: Administrator
 * @Date: 2018/11/30 11:30
 */
@TableName("tbl_permission")
@Getter
@Setter
public class Permission {

    // 权限id
    @TableId("permission_id")
    private int permissionId;

    // 名称
    @TableField("permission_name")
    private String permissionName;

}
