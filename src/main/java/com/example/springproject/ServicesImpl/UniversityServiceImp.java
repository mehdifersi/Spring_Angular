package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.UniversityServiceInterface;
import com.example.springproject.entities.University;
import com.example.springproject.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImp extends BaseServiceImp<University,Integer> implements UniversityServiceInterface {
        @Autowired
    UniversityRepository universityRepository;
}
