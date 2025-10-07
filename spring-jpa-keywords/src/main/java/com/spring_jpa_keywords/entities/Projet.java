package com.spring_jpa_keywords.entities;

import jakarta.persistence.*;


@Entity
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String code;

    @OneToOne
    private Projet_Detail projetDetail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Projet_Detail getProjetDetail() {
        return projetDetail;
    }

    public void setProjetDetail(Projet_Detail projetDetail) {
        this.projetDetail = projetDetail;
    }
}
