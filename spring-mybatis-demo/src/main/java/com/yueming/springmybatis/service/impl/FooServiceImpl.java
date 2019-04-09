package com.yueming.springmybatis.service.impl;

import com.yueming.springmybatis.DAO.UserMapper;
import com.yueming.springmybatis.VO.User;

public class FooServiceImpl  {

    private final UserMapper userMapper;

    public FooServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User doSomeBusinessStuff(String userId) {
        return this.userMapper.getUser(userId);
    }
}
