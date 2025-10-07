package com.spring_jpa_keywords.repository;

import com.spring_jpa_keywords.entities.Projet;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Id> {
}
