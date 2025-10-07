package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> liste;

    @OneToOne
    private Universite universite;

}
