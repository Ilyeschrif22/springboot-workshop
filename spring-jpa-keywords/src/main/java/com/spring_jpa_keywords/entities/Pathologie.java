package com.spring_jpa_keywords.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPath;

    private String codePath;

    private String libelle;

    private String description;

    private Boolean archive;


}
