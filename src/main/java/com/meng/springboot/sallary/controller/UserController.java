package com.meng.springboot.sallary.controller;

import com.meng.springboot.sallary.server.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping("/getUser")
    public String getUser(){
        return userService.getUser();
    }
}
