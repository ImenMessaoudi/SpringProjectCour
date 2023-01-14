package com.example.firstprojectspring2.DAO.Repositories;

import com.example.firstprojectspring2.DAO.Entities.Universite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UniversiteRepo extends CrudRepository<Universite,Long> {


}
