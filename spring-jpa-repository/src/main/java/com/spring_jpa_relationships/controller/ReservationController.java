package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Reservation;
import com.spring_jpa_relationships.services.IReservation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationController {

    private final IReservation ireservation;

    @PostMapping("/add")
    public Reservation add(@RequestBody Reservation reservation) {
        return ireservation.addReservation(reservation);
    }

    @GetMapping("/all")
    public List<Reservation> getAll() {
        return ireservation.allReservations();
    }

    @PutMapping("/update")
    public Reservation update(@RequestBody Reservation reservation) {
        return ireservation.updateReservation(reservation);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ireservation.deleteReservation(id);
    }
}
