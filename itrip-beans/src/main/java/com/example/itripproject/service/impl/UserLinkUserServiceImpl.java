package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.entity.UserLinkUser;
import com.example.itripproject.mapper.UserLinkUserMapper;
import com.example.itripproject.service.UserLinkUserService;
@Service
public class UserLinkUserServiceImpl extends ServiceImpl<UserLinkUserMapper, UserLinkUser> implements UserLinkUserService{

}
