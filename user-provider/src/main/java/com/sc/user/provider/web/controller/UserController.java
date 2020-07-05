package com.sc.user.provider.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.sc.user.provider.model.UserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    private  Integer port;
    @GetMapping("/v1/user/{id}")
    public  Object get(@PathVariable("id")String id){
        return JSONObject.toJSONString( new UserModel(id,"gaoqc",port));
    }
}
