package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)
    public Integer id;
    public String username;
    public String nickName;
    public String password;
    public Integer age;
    public String sex;
    public String address;

    public User() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

}
