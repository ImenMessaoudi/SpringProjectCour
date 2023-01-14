package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Departement;
import com.example.firstprojectspring2.DAO.Repositories.DetailEquipeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DetailEquipe implements IDepartementService {
    @Autowired //@Injected
    private DetailEquipeRepo detailEquipeRepo;

    @Override
    public Departement addDepartement(Departement c) {
        return null;
    }

    @Override
    public Departement UpdateDepartement(Departement c) {
        return null;
    }

    @Override
    public void deleteDepartement(Departement c) {

    }

    @Override
    public void deleteDepartement(Long id) {

    }

    @Override
    public List<Departement> findAllDepartements() {
        return null;
    }

    @Override
    public Departement findDepartementById(Long id) {
        return null;
    }
}
