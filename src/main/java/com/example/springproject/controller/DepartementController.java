package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.DepartementServiceImp;
import com.example.springproject.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;

public class DepartementController extends BaseController<Departement,Integer> {
    @Autowired
    DepartementServiceImp departementServiceImp;
}
