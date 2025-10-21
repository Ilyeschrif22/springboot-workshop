package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Universite;
import com.spring_jpa_relationships.services.IUniversite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteController {

    private final IUniversite iuniversite;

    @PostMapping("/add")
    public Universite add(@RequestBody Universite universite) {
        return iuniversite.addUniversite(universite);
    }

    @GetMapping("/all")
    public List<Universite> getAll() {
        return iuniversite.allUniversites();
    }

    @PutMapping("/update")
    public Universite update(@RequestBody Universite universite) {
        return iuniversite.updateUniversite(universite);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        iuniversite.deleteUniversite(id);
    }


}
