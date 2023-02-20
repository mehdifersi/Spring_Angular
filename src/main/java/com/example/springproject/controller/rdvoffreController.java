package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.RdvoffreServiceImp;
import com.example.springproject.entities.RDV_offre;
import org.springframework.beans.factory.annotation.Autowired;

public class rdvoffreController extends BaseController<RDV_offre,Integer> {
    @Autowired
    RdvoffreServiceImp rdvoffreServiceImp;
}
