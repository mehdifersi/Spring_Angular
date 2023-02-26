package com.example.springproject.ServiceInterface;

import com.example.springproject.entities.Mailingcontent;
import com.example.springproject.entities.Users;

import java.util.List;

public interface MailingServiceInterface extends BaseServiceInterface<Mailingcontent,Integer>{

    public void sendEmail(String toEmail,
                          String Subject,
                          String body);

    public List<Mailingcontent> gethistory(int  a);

    public void sendMailStudentConfirmation(Users user);

}
