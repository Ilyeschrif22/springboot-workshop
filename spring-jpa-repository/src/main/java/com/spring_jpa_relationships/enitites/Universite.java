package com.spring_jpa_relationships.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUniversite;
    private String nomUniversite;
    private String adress;

    @OneToOne
    private Foyer foyer;
}
