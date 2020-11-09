package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.entity.HotelOrder;
import com.example.itripproject.mapper.HotelOrderMapper;
import com.example.itripproject.service.HotelOrderService;
@Service
public class HotelOrderServiceImpl extends ServiceImpl<HotelOrderMapper, HotelOrder> implements HotelOrderService{

}
