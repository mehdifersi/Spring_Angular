package com.example.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Offre")
public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOffre")
    private Integer idOffre; // Clé primaire
    private String JuryAppreciation;
    private String Result;
    private String titre;
    private String description;

    @OneToOne
    private FileInfo Doc;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<CondidatOffre> condidatOffres;
    @ManyToOne
    Departement departement;
    }
