package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.UserServiceInterface;
import com.example.springproject.entities.Users;
import com.example.springproject.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp extends BaseServiceImp<Users,Integer>{

    @Autowired
    UsersRepository usersRepository ;
}
