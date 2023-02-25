package com.example.springproject.ServiceInterface;

import com.example.springproject.entities.Users;
import org.apache.catalina.User;

public interface UserServiceInterface extends BaseServiceInterface<Users,Integer>{
    public Users addStudent(Users user);
}
