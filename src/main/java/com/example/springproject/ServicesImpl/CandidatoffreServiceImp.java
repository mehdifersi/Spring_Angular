package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.CandidatoffreServiceInterface;
import com.example.springproject.entities.CondidatOffre;
import com.example.springproject.repository.CandidatoffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoffreServiceImp extends BaseServiceImp<CondidatOffre,Integer> implements CandidatoffreServiceInterface {
    @Autowired
    CandidatoffreRepository candidatoffreRepository;
}
