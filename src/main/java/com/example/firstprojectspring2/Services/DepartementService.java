package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Departement;
import com.example.firstprojectspring2.DAO.Repositories.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartementService implements IDepartementService{
    @Autowired //@Injected
    private DepartementRepo departementRepo;

    @Override
    public Departement addDepartement(Departement c) {
        return departementRepo.save(c);
    }

    @Override
    public Departement UpdateDepartement(Departement c) {
        return departementRepo.save(c);
    }

    @Override
    public void deleteDepartement(Departement c) {
        departementRepo.delete(c);
    }

    @Override
    public void deleteDepartement(Long id) {
        departementRepo.deleteById(id);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return (List<Departement>)departementRepo.findAll();
    }

    @Override
    public Departement findDepartementById(Long id) {
        return departementRepo.findById(id).get();
    }
}
