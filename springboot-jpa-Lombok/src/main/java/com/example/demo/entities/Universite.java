package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class Universite {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;

    private String addresse;

    @OneToOne()
    private Foyer foyer;
}
