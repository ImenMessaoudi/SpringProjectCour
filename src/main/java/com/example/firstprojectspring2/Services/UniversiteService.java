package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Departement;
import com.example.firstprojectspring2.DAO.Entities.Universite;
import com.example.firstprojectspring2.DAO.Repositories.DepartementRepo;
import com.example.firstprojectspring2.DAO.Repositories.UniversiteRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversiteService implements IUniversiteService{
    @Autowired //@Injected
    private UniversiteRepo universiteRepo;

    @Autowired
    private DepartementRepo depRepo;

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite univAffecter = universiteRepo.findById(Long.valueOf(idUniversite)).get();//parent
        Departement depAffecter = depRepo.findById(Long.valueOf(idDepartement)).get();// child

        univAffecter.getDepartements().add(depAffecter);
        universiteRepo.save(univAffecter);



    }
}
