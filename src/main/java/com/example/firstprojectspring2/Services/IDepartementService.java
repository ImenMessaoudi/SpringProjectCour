package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Contrat;
import com.example.firstprojectspring2.DAO.Entities.Departement;

import java.util.List;

public interface IDepartementService {
    Departement addDepartement(Departement c );
    Departement UpdateDepartement(Departement c );
    void deleteDepartement(Departement c);
    void deleteDepartement(Long id);
    List<Departement> findAllDepartements();
    Departement findDepartementById(Long id);
}
