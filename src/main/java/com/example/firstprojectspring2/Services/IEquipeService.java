package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> addEquipe(Equipe  e);
    Equipe  updateEquipe(Equipe e);
    void deleteEquipe(Equipe e);
    void deleteEquipeById(Long id);
    List<Equipe> FindAllEquipe();
    Equipe findEquipeById(Long id);
}
