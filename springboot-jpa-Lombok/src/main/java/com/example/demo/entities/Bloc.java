package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambre;

    @ManyToOne
    private Foyer foyer;

}
