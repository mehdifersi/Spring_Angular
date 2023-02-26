package com.example.springproject.ServicesImpl;

import com.example.springproject.ServiceInterface.MailingServiceInterface;
import com.example.springproject.entities.Mailingcontent;
import com.example.springproject.entities.Users;
import com.example.springproject.repository.MailingRepository;
import com.example.springproject.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
@Slf4j

public class MailingServiceImp extends BaseServiceImp<Mailingcontent, Integer> implements MailingServiceInterface {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    MailingRepository mailingRepository;
    @Autowired
    UsersRepository usersRepository;

    public void sendEmail(String toEmail,
                          String Subject,
                          String body
    ){

        log.info("sending mail to {} ,subject is :{}",toEmail,Subject);
        SimpleMailMessage message =  new SimpleMailMessage();
        message.setFrom("mahdi.fersi@esprit.tn");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(Subject);

        javaMailSender.send(message);

        Mailingcontent mailingcontent= new Mailingcontent();
        mailingcontent.setBody(body);
        mailingcontent.setSubject(Subject);
        mailingcontent.setToEmail(toEmail);
        mailingRepository.save(mailingcontent);
    }

    @Override
    public  List<Mailingcontent> gethistory(int a) {
        Users u = usersRepository.findById(a).orElse(null);

        List<Mailingcontent> mailingcontents = mailingRepository.getAllByToEmail(u.getEmail());
        return mailingcontents;

    }

    @Override
    public void sendMailStudentConfirmation(Users user) {
        String toEmail= user.getEmail();
        String Subject = "Confirmation Mail";
        String body = " Welcome to Esprit , " +
                "this is an automatic confirmation mail for your account registration ";
        sendEmail(toEmail,Subject,body);
    }
}
