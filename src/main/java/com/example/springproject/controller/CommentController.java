package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.CommentServiceImp;
import com.example.springproject.entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@CrossOrigin("*")
public class CommentController extends BaseController<Comment,Integer>{

    @Autowired
    CommentServiceImp commentServiceImp;
}
