package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Etudiant;
import java.util.List;

public interface IEtudiant {
    Etudiant addEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    List<Etudiant> allEtudiants();
}
