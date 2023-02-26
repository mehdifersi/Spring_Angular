package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Users;
import com.example.springproject.repository.UsersRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImp extends BaseServiceImp<Users,Integer>  {

    @Autowired
    UsersRepository usersRepository ;



}
