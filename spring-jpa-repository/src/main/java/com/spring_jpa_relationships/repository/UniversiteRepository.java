package com.spring_jpa_relationships.repository;

import com.spring_jpa_relationships.enitites.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
