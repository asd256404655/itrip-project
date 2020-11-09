package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.mapper.UserMapper;
import com.example.itripproject.entity.User;
import com.example.itripproject.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
