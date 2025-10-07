package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}
