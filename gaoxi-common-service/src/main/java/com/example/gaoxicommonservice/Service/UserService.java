package com.example.gaoxicommonservice.Service;

import com.example.gaoxicommonservice.model.LoginReq;
import com.example.gaoxicommonservice.model.UserEntity;

public interface UserService {
    public UserEntity login(LoginReq loginReq);
}
