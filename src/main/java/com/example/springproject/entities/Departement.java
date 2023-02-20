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
@Table( name = "Departement")
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartement")
    private Integer idDepartement; // Clé primaire
    private String NomDepart;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departement")
    private Set<Offre> offres;
    @ManyToOne
    University university;
}
