package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.entity.OrderLinkUser;
import com.example.itripproject.mapper.OrderLinkUserMapper;
import com.example.itripproject.service.OrderLinkUserService;
@Service
public class OrderLinkUserServiceImpl extends ServiceImpl<OrderLinkUserMapper, OrderLinkUser> implements OrderLinkUserService{

}
