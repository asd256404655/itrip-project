package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.mapper.ProductStoreMapper;
import com.example.itripproject.entity.ProductStore;
import com.example.itripproject.service.ProductStoreService;
@Service
public class ProductStoreServiceImpl extends ServiceImpl<ProductStoreMapper, ProductStore> implements ProductStoreService{

}
