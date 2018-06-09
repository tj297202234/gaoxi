package com.example.gaoxicontroller.controller.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.gaoxicommonservice.Service.UserService;
import com.example.gaoxicommonservice.model.LoginReq;
import com.example.gaoxicommonservice.model.UserEntity;
import com.example.gaoxicontroller.controller.UserController;
import com.example.gaoxicontroller.model.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class UserControllerImpl implements UserController {
    @Reference(version = "1.0.0")
    private UserService userService;
    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        Result result = new Result();
        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
        result.setCode("200");
        result.setMessage("success");
        result.setData(userEntity);
        return result;
    }
}

