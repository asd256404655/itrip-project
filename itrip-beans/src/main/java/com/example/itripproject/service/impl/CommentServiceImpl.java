package com.example.itripproject.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.itripproject.entity.Comment;
import com.example.itripproject.mapper.CommentMapper;
import com.example.itripproject.service.CommentService;
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService{

}
