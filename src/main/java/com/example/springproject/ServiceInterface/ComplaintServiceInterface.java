package com.example.springproject.ServiceInterface;

import com.example.springproject.entities.Complaint;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintServiceInterface extends BaseServiceInterface<Complaint,Integer>{
}
