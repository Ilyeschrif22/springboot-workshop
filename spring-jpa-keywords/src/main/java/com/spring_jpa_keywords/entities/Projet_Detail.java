package com.spring_jpa_keywords.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Projet_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private String technologies;

    private Long coutProvisoire;

    private Date dateDebut;

    @OneToOne(mappedBy = "projetDetail")
    private Projet projet;

}
