package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Contrat;
import com.example.firstprojectspring2.DAO.Entities.Etudiant;

import java.awt.*;
import java.util.Date;
import java.util.List;

public interface IContratService {

    Contrat addContrat(Contrat c );
    Contrat UpdateContrat(Contrat c );
    void deleteContrat(Contrat c);
    void deleteContratById(Long id);
    List<Contrat> findAllContrat();
    Contrat findContratById(Long id);

    List<Contrat> searchContratByArchive(Boolean ar);

    List<Contrat>searchContratByDateDebutC(Date ddc);

    List<Contrat> searchContratByArchiveAndDateDebut(boolean ar, Date d);

    List<Contrat> searchContratByPrix(float p);

    String retrieveAndUpdateStatusContrat();

    List<Contrat> addContrats(List<Contrat> listC);

}
