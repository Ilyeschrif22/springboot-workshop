package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;

    @OneToOne
    private Universite universite;

    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocs ;
}
