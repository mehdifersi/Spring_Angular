package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.AdServiceInterface;
import com.example.springproject.entities.Ads;
import com.example.springproject.repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImp extends BaseServiceImp<Ads,Integer> implements AdServiceInterface {

    @Autowired
    AdsRepository adsRepository;
}
