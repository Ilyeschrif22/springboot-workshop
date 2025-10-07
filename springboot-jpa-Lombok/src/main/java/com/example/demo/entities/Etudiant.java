package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private  Long cin;

    private String ecole;

    private Date dateNaisssances;

    @ManyToMany(mappedBy ="etudiants")
    private List<Reservation>reservations;
}
