package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.entity.Hotel;
import com.example.itripproject.mapper.HotelMapper;
import com.example.itripproject.service.HotelService;
@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements HotelService{

}
