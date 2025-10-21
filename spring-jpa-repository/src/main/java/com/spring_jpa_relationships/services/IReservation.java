package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Reservation;
import java.util.List;

public interface IReservation {
    Reservation addReservation(Reservation reservation);
    void deleteReservation(Long idReservation);
    Reservation updateReservation(Reservation reservation);
    List<Reservation> allReservations();
}
