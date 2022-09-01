package com.gcfw.user.service.impl;

import com.gcfw.user.entity.User;
import com.gcfw.user.mapper.UserMapper;
import com.gcfw.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user)
    {
        return userMapper.getUser(user);
    }
}
