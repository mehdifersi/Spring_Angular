package com.example.springproject.controller;

import com.example.springproject.ServicesImpl.MailingServiceImp;
import com.example.springproject.entities.Mailingcontent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/mailing")
@CrossOrigin("*")

public class MailingController extends  BaseController<Mailingcontent,Integer> {

    @Autowired
    MailingServiceImp mailingServiceImp;

    @PutMapping("/mail")

    public ResponseEntity<?> sendEmail(@RequestBody Mailingcontent mailingcontent){


        mailingServiceImp.sendEmail(mailingcontent.getToEmail(),
                mailingcontent.getSubject(),
                mailingcontent.getBody());




        return ResponseEntity.ok("email has been sent !");
    }
    @GetMapping("/history/{id}")
    public List<Mailingcontent> gethistory(@PathVariable(value = "id")  int id){
        return mailingServiceImp.gethistory(id);
    }
}
