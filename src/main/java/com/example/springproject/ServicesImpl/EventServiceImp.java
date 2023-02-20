package com.example.springproject.ServicesImpl;

import com.example.springproject.entities.Event;
import com.example.springproject.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImp extends BaseServiceImp<Event,Integer>{

    @Autowired
    EventRepository eventRepository;
}
