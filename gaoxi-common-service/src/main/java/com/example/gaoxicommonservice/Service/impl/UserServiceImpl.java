package com.example.gaoxicommonservice.Service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.gaoxicommonservice.Service.UserService;
import com.example.gaoxicommonservice.model.LoginReq;
import com.example.gaoxicommonservice.model.UserEntity;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity login(LoginReq loginReq) {
        return new UserEntity();
    }
}
