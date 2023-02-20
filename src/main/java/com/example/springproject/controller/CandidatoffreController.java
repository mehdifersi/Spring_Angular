package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.CandidatoffreServiceImp;
import com.example.springproject.entities.CondidatOffre;
import org.springframework.beans.factory.annotation.Autowired;

public class CandidatoffreController extends BaseController<CondidatOffre,Integer> {
    @Autowired
    CandidatoffreServiceImp candidatoffreServiceImp;
}
