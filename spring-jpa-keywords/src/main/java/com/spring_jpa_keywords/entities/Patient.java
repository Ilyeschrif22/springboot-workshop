package com.spring_jpa_keywords.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private String firstName;

    private String identifiantPieceIdentite;

    private Date dateEmission;

    private String nomP;

    private String prenomP;

    @ManyToMany
    private List<Pathologie> pathologies;
}
