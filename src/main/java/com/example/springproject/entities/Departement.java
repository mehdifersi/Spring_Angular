package com.example.springproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
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
