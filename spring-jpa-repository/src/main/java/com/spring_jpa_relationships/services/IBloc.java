package com.spring_jpa_relationships.services;

import com.spring_jpa_relationships.enitites.Bloc;
import java.util.List;

public interface IBloc {
    Bloc addBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    Bloc updateBloc(Bloc bloc);
    List<Bloc> allBlocs();
}
