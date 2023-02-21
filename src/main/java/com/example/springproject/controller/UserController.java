package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.UserServiceImp;
import com.example.springproject.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController extends BaseController<Users,Integer>{

    @Autowired
    UserServiceImp userServiceImp;


}
