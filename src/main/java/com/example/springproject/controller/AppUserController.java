package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.AppUserServiceImp;
import com.example.springproject.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/app-user")
@CrossOrigin("*")
public class AppUserController extends BaseController<User,Integer>{

    @Autowired
    AppUserServiceImp userServiceImp;

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
    public User addStudent(@RequestBody User user){
        userServiceImp.addStudent(user);
        return user;
    }

    @PostMapping("/addFileAndAssignToStudent/{idUser}")
    public void addFileAndAssignToStudent(@RequestParam("file") MultipartFile file, @PathVariable Integer idUser){
        userServiceImp.addFileAndAssignToStudent(file,idUser);
    }

}
