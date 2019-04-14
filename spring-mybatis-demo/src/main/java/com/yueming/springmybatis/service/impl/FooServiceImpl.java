package com.yueming.springmybatis.service.impl;

import com.yueming.springmybatis.DAO.UserMapper;
import com.yueming.springmybatis.VO.User;
import com.yueming.springmybatis.service.FooService;

public class FooServiceImpl  implements FooService {

    private final UserMapper userMapper;

    public FooServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User doSomeBusinessStuff(String userId) {
        return this.userMapper.getUser(userId);
    }
}
