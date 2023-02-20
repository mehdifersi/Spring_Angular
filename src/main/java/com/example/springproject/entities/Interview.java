package com.example.springproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Interview  implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInterview;

    @Temporal(TemporalType.DATE)
    private Date dateInterview ;

    private Integer TotalScore;
    private Integer QcmScore;
    private Integer InterviewScore;

    private String Deliberation; // not sure if string

    @OneToOne
    private Users student;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Users> evaluators;


}
