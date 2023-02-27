package com.example.springproject.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Builder
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})
public class User implements UserDetails {
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
    private Boolean locked;
    private Boolean enabled;
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Token> tokens;

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
    private Set<FileDB> files;

    @ManyToOne
    Classroom classroom;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
