package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.DepartementServiceInterface;
import com.example.springproject.entities.Departement;
import com.example.springproject.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartementServiceImp extends BaseServiceImp<Departement,Integer> implements DepartementServiceInterface {
    @Autowired
    DepartementRepository departementRepository;
}
