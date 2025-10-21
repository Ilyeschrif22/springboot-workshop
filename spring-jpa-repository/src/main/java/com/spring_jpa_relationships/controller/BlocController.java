package com.spring_jpa_relationships.controller;

import com.spring_jpa_relationships.enitites.Bloc;
import com.spring_jpa_relationships.services.IBloc;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {

    private final IBloc ibloc;

    @PostMapping("/add")
    public Bloc ajout(@RequestBody Bloc bloc) {
        return ibloc.addBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> getAll() {
        return ibloc.allBlocs();
    }

    @PutMapping("/update")
    public Bloc update(@RequestBody Bloc bloc) {
        return ibloc.updateBloc(bloc);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        ibloc.deleteBloc(id);
    }
}

