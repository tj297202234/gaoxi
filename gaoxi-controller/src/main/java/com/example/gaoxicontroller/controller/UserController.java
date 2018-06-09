package com.example.gaoxicontroller.controller;

import com.example.gaoxicommonservice.model.LoginReq;
import com.example.gaoxicontroller.model.Result;

import javax.servlet.http.HttpServletResponse;

public interface UserController {
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
