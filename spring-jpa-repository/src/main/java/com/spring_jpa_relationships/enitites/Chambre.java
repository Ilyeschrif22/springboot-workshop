package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre;

    private int capacite;

    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservations;
}


