package com.example.springproject.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Interview")

public class Interview  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInterview;
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "MM/dd/yyyy")
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
