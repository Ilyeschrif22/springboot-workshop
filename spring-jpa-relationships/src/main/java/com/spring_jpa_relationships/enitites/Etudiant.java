package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;

    @ManyToMany
    private Set<Reservation> reservations;
}
