package com.meng.springboot.sallary.server;

import com.meng.springboot.sallary.mapper.UserMapper;
import com.meng.springboot.sallary.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public String getUser(){
        List<User> userList = userMapper.getUserList();
        return userList.size()>0 ? userList.get(0).toString() : null;
    }
}
