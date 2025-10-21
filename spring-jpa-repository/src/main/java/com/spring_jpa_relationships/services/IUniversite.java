package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Universite;
import java.util.List;

public interface IUniversite {
    Universite addUniversite(Universite universite);
    void deleteUniversite(Long idUniversite);
    Universite updateUniversite(Universite universite);
    List<Universite> allUniversites();
}
