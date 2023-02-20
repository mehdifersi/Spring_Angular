package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.CandidatoffreServiceImp;
import com.example.springproject.entities.CondidatOffre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidatoffre")
@CrossOrigin("*")
public class CandidatoffreController extends BaseController<CondidatOffre,Integer> {
    @Autowired
    CandidatoffreServiceImp candidatoffreServiceImp;
}
