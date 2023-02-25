package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.ComplaintServiceInterface;
import com.example.springproject.entities.Complaint;
import com.example.springproject.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintServiceImp extends BaseServiceImp<Complaint,Integer> implements ComplaintServiceInterface {

    @Autowired
    ComplaintRepository complaintRepository;
}
