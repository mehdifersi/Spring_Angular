package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.PublicationServiceImp;
import com.example.springproject.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publication")
@CrossOrigin("*")
public class PublicationController extends BaseController<Publication,Integer>{

    @Autowired
    PublicationServiceImp publicationServiceImp;
}
