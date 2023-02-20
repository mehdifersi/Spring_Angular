package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.RDV_offre;
import com.example.springproject.repository.RdvoffreRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RdvoffreServiceImp extends BaseServiceImp<RDV_offre,Integer> {
        @Autowired
    RdvoffreRepository rdvoffreRepository;
}
