package com.spring_jpa_keywords.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class FamilleActe{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFA;

    private String codeFa;

    private String libelle;

    private String description;


    @OneToMany(mappedBy = "familleActe")
    private List<Acte> actes ;
}
