package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.ClassroomServiceImp;
import com.example.springproject.entities.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classroom")
@CrossOrigin("*")
public class ClassroomController extends BaseController<Classroom,Integer>{

    @Autowired
    ClassroomServiceImp classroomServiceImp;
}
