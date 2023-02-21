package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.EventServiceImp;
import com.example.springproject.entities.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
@CrossOrigin("*")
public class EventController extends BaseController<Event,Integer>{

    @Autowired
    EventServiceImp eventServiceImp;
}
