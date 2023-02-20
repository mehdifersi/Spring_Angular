package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.AdServiceImp;
import com.example.springproject.entities.Ads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ads")
@CrossOrigin("*")
public class AdsController extends BaseController<Ads,Integer>{

    @Autowired
    AdServiceImp adServiceImp;
}
