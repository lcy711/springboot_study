package com.example.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.common.Result;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    UserMapper userMapper;
    @PostMapping
    public Result<?> save(@RequestBody User user) {
        if(user.getPassword() == null){
           user.setPassword("123456");
        }
        userMapper.insert(user);
        return Result.success();

    }

    @GetMapping
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                           @RequestParam(defaultValue = "10") Integer pageSize,
                           @RequestParam(defaultValue = "") String search) {
        QueryWrapper<User> queryWrapper = new QueryWrapper();
       Page<User> userPage =
               userMapper.selectPage(
                       new Page<>(pageNum,pageSize),
                       //queryWrapper.like("nick_name", "")
                       queryWrapper.lambda().like(User::getNickName, search)
               );

        //queryWrapper.like("nick_name", "");
        //Wrappers.<User>lambdaQuery()
           //     .like(User::getNickName,search)
       return Result.success(userPage);
    }
}
