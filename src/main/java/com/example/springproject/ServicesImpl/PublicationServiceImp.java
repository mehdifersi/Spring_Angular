package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.PublicationServiceInterface;
import com.example.springproject.entities.Publication;
import com.example.springproject.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class PublicationServiceImp extends BaseServiceImp<Publication, Integer> implements PublicationServiceInterface {

    @Autowired
    PublicationRepository publicationRepository;
}
