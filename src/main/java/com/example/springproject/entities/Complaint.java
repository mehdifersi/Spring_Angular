package com.example.springproject.entities;
import javax.persistence.*;

import lombok.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor




public class Complaint   implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idComplaint;
    private String subject;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date date ;
    @Enumerated(EnumType.STRING)
    private StatusComplaint status;

    @ManyToOne(cascade = CascadeType.ALL)
    Users user;

}

