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
@Table( name = "CondidatOffre")
public class CondidatOffre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOffre")
    private Integer idOffre; // Clé primaire
    private String Email;

    @OneToOne
    private FileInfo CV_motiv;
    @ManyToMany(mappedBy = "condidatOffres" , cascade = CascadeType.ALL)
    private Set<Offre> offres;
    @OneToOne
    private RDV_offre rdv_offre;
}
