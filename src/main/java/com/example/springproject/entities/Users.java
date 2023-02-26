package com.example.springproject.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser")
    private Integer idUser; // Clé primaire
    private String firstName;
    private String lastName;
    private String username;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String email;
    private String password;
    private String numTel;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
    private Date birthday;
    private Status status=Status.Active;
    private Integer warning=0;
    private Boolean locked=false;
    private Boolean enabled=false;

    public Users(String firstName, String lastName, String username, Role role, String email, String password, String numTel, Date birthday, Status status, Integer warning, Boolean locked, Boolean enabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.role = role;
        this.email = email;
        this.password = password;
        this.numTel = numTel;
        this.birthday = birthday;
        this.status = status;
        this.warning = warning;
        this.locked = locked;
        this.enabled = enabled;
    }

    public Users(String firstName, String lastName, String password, String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    @ManyToOne
    Event event;
    @ManyToOne
    Event event2;
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "complaintPar")
    List<Complaint> listOfComplaints;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "publierPar")
    List<Publication> listOfPublication;

    @ManyToMany(mappedBy = "likerPar",cascade = CascadeType.ALL)
    private Set<Publication> listPublicationLikee;

    @ManyToOne
    Realisation realisation;

    @OneToOne
    Interview interviewStudent;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Interview> InterviewEvaluators;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<FileInfo> files;

    @ManyToOne
    Classroom classroom;


}
