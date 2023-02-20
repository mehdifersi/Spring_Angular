package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Interview;
import com.example.springproject.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewServiceImp extends BaseServiceImp<Interview,Integer>{

    @Autowired
    InterviewRepository interviewRepository;
}
