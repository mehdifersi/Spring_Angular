package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.BlocServiceImp;
import com.example.springproject.entities.Bloc;
import org.springframework.beans.factory.annotation.Autowired;

public class BlocController extends BaseController<Bloc,Integer> {
    @Autowired
    BlocServiceImp blocServiceImp;
}
