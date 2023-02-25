package com.example.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "FileInfo")
public class FileInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFile")
    private Integer idFile;

    private String name;
    private String url;


    public FileInfo(String filename, String url) {
    }

}
