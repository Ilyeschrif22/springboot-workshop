package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Foyer;
import java.util.List;

public interface IFoyer {
    Foyer addFoyer(Foyer foyer);
    void deleteFoyer(Long idFoyer);
    Foyer updateFoyer(Foyer foyer);
    List<Foyer> allFoyers();
}
