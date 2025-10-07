package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre;

    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;
}


