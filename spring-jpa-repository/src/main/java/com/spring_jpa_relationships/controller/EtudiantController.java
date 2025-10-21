package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Etudiant;
import com.spring_jpa_relationships.services.IEtudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantController {

    private final IEtudiant ietudiant;

    @PostMapping("/add")
    public Etudiant add(@RequestBody Etudiant etudiant) {
        return ietudiant.addEtudiant(etudiant);
    }

    @GetMapping("/all")
    public List<Etudiant> getAll() {
        return ietudiant.allEtudiants();
    }

    @PutMapping("/update")
    public Etudiant update(@RequestBody Etudiant etudiant) {
        return ietudiant.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ietudiant.deleteEtudiant(id);
    }
}
