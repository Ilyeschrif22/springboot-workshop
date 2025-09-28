package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "table_chambre")
public class Chambre {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private  String type;


}
