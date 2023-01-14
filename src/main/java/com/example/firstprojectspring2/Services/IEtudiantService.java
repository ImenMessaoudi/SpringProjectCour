package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Etudiant;

import java.util.Date;
import java.util.List;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    void deleteEtudiant(Etudiant e);
    void delateEtudiantById(long id);
    List <Etudiant> FindAllEtudiant();
    Etudiant findById(Long id);
//    List<Etudiant> searchContratByArchiveAndDateDebut(boolean ar, Date d);

    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);


}
