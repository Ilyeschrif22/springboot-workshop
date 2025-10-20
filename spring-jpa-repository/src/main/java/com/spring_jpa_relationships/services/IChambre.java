package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Chambre;

import java.util.List;

public interface IChambre {
    Chambre addChambre(Chambre chambre);
    void deleteChambre (Long idChambre);
    Chambre updateChambre (Chambre chambre);
    List<Chambre> allChambres();
}
