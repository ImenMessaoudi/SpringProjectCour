package com.example.firstprojectspring2.DAO.Repositories;

import com.example.firstprojectspring2.DAO.Entities.Departement;
import com.example.firstprojectspring2.DAO.Entities.Universite;
import org.springframework.data.repository.CrudRepository;

public interface DepartementRepo extends CrudRepository<Departement,Long> {
}
