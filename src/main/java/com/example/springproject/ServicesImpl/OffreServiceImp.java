package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.OffreServiceInterface;
import com.example.springproject.entities.Offre;
import com.example.springproject.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffreServiceImp extends BaseServiceImp<Offre,Integer> implements OffreServiceInterface {
    @Autowired
    OffreRepository offreRepository;
}
