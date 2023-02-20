package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.CondidatOffre;
import com.example.springproject.repository.CandidatoffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoffreServiceImp extends BaseServiceImp<CondidatOffre,Integer> {
    @Autowired
    CandidatoffreRepository candidatoffreRepository;
}
