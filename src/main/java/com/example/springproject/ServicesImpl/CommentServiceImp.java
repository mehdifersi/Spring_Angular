package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Comment;
import com.example.springproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp extends BaseServiceImp<Comment,Integer>{

    @Autowired
    CommentRepository commentRepository;
}
