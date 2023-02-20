package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.OffreServiceImp;
import com.example.springproject.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;

public class OffreController extends BaseController<Offre,Integer>{
    @Autowired
    OffreServiceImp offreServiceImp;
}
