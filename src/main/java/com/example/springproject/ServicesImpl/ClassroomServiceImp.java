package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.ClassroomServiceInterface;
import com.example.springproject.entities.Classroom;
import com.example.springproject.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImp extends BaseServiceImp<Classroom,Integer> implements ClassroomServiceInterface {

    @Autowired
    ClassroomRepository classroomRepository;

}
