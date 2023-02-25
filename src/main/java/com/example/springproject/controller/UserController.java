package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.UserServiceImp;
import com.example.springproject.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController extends BaseController<Users,Integer>{

    @Autowired
    UserServiceImp userServiceImp;

    /*@Override
    public Users addStudent(Users user){

        if(user.getRole().equals(user.getRole().valueOf("Student"))){
            userServiceImp.addStudent(user);
            return user;
        }
        else {
            add(user);
        }
        return user ;
    }
    */


    @PostMapping("/addStudent")
    public Users addStudent(Users user){
        userServiceImp.addStudent(user);
        return user;
    }

}
