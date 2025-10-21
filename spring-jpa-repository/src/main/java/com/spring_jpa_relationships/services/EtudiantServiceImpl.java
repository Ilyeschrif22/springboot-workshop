package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Chambre;
import com.spring_jpa_relationships.enitites.Etudiant;
import com.spring_jpa_relationships.repository.ChambreRepository;
import com.spring_jpa_relationships.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiant {

    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
    etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> allEtudiants() {
        return etudiantRepository.findAll();
    }
}
