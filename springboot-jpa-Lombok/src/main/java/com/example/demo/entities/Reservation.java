package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idReservation;

    private Date anneeUniversitaire;

    private Boolean estValide;

    @ManyToMany
    private List<Etudiant> etudiants;
}
