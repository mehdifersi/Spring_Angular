package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.InterviewServiceImp;
import com.example.springproject.entities.Interview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interview")
@CrossOrigin("*")
public class InterviewController extends BaseController<Interview,Integer>{

    @Autowired
    InterviewServiceImp interviewServiceImp;
}
