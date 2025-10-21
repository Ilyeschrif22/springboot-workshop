package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Foyer;
import com.spring_jpa_relationships.services.IFoyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerController {

    private final IFoyer ifoyer;

    @PostMapping("/add")
    public Foyer add(@RequestBody Foyer foyer) {
        return ifoyer.addFoyer(foyer);
    }

    @GetMapping("/all")
    public List<Foyer> getAll() {
        return ifoyer.allFoyers();
    }

    @PutMapping("/update")
    public Foyer update(@RequestBody Foyer foyer) {
        return ifoyer.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ifoyer.deleteFoyer(id);
    }
}
