package com.huayue.mybatisplus.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Auther: Administrator
 * @Date: 2018/11/22 13:56
 */
@Getter
@Setter
@TableName("tb_user")
public class User extends Model<User> implements Serializable {
    @TableId(value = "user_id", type = IdType.UUID)
    private String userId;
    private String userName;
    @TableField("user_password")
    private String userPassword;

    @Override
    protected Serializable pkVal() {
        return userId;
    }
}
