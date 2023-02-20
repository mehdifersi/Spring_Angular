package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.OffreServiceImp;
import com.example.springproject.entities.Offre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offre")
@CrossOrigin("*")
public class OffreController extends BaseController<Offre,Integer>{
    @Autowired
    OffreServiceImp offreServiceImp;
}
