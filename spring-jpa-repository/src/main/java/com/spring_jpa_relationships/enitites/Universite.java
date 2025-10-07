package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

@Entity
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversite;
    private String nomUniversite;
    private String adress;


    @OneToOne
    private Foyer foyer;
}
