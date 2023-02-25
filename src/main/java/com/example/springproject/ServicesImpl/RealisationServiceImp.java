package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Realisation;
import com.example.springproject.repository.RealisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealisationServiceImp extends BaseServiceImp<Realisation,Integer>{
    @Autowired
    RealisationRepository realisationRepository ;
}
