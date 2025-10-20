package com.spring_jpa_relationships.repository;

import com.spring_jpa_relationships.enitites.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
