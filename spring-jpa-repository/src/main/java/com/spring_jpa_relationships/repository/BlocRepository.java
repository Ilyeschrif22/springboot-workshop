package com.spring_jpa_relationships.repository;

import com.spring_jpa_relationships.enitites.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

    public Bloc findByIdBloc(long id);
    public List<Bloc> findAll();

}
