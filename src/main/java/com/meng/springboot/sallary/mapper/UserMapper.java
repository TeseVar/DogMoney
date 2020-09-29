package com.meng.springboot.sallary.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.meng.springboot.sallary.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> getUserList();

}
