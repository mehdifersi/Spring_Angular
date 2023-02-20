package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Bloc;
import com.example.springproject.repository.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BlocServiceImp extends BaseServiceImp<Bloc,Integer> {
    @Autowired
    BlocRepository blocRepository;
}
