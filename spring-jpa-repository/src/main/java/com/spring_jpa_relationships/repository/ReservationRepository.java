package com.spring_jpa_relationships.repository;

import com.spring_jpa_relationships.enitites.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
