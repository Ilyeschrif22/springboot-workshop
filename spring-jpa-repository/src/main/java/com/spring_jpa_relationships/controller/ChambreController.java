package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Chambre;
import com.spring_jpa_relationships.services.IChambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {

    private final IChambre ichambre;

    @PostMapping("/ajout")
    public Chambre ajout(@RequestBody Chambre chambre) {
        return ichambre.addChambre(chambre);
    }

    @GetMapping("/all")
    public List<Chambre> getAll() {
        return ichambre.allChambres();
    }

}
