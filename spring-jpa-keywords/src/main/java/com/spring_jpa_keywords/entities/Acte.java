package com.spring_jpa_keywords.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Acte{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;

    private String codeActe;

    private int cotationActe;

    private float prixUnitaireActe;

    private String descriptionActe;

    @ManyToOne
    private FamilleActe familleActe;



}
