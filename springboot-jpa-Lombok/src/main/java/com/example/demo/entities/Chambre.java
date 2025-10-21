package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Chambre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private  Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private  TypeChambre typeC;

    @OneToMany
    private List<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;



}
