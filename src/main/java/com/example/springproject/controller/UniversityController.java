package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.UniversityServiceImp;
import com.example.springproject.entities.University;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversityController extends BaseController<University,Integer> {

    @Autowired
    UniversityServiceImp universityServiceImp;
}
