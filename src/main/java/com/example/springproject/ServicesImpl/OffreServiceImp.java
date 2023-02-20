package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Offre;
import com.example.springproject.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OffreServiceImp extends BaseServiceImp<Offre,Integer> {
    @Autowired
    OffreRepository offreRepository;
}
