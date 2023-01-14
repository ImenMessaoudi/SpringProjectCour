package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Equipe;
import com.example.firstprojectspring2.DAO.Repositories.EquipeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EquipeService implements IEquipeService{

    @Autowired //@Injected
    private EquipeRepo equipeRepo;
    List<Equipe> equipes;

    @Override
    public List<Equipe> addEquipe(Equipe e) {
       /* equipeRepo.save(e);
        List<Equipe> equipeRepo.FindAllEquipe();
        return equipes;*/
        return null;
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepo.save(e) ;
    }

    @Override
    public void deleteEquipe(Equipe e) {
        equipeRepo.delete(e);

    }

    @Override
    public void deleteEquipeById(Long id) {
        equipeRepo.deleteById(id);

    }

    @Override
    public List<Equipe> FindAllEquipe() {
        return (List<Equipe>)equipeRepo.findAll() ;
    }

    @Override
    public Equipe findEquipeById(Long id) {
        return equipeRepo.findById(id).get();
    }
}
