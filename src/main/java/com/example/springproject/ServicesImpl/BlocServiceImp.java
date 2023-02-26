package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.BlocServiceInterface;
import com.example.springproject.entities.Bloc;
import com.example.springproject.repository.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlocServiceImp extends BaseServiceImp<Bloc,Integer> implements BlocServiceInterface {
    @Autowired
    BlocRepository blocRepository;
}
