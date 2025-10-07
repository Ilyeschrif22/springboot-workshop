package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    @ManyToMany(mappedBy = "reservations")
    private Set<Etudiant> etudiants;

}
