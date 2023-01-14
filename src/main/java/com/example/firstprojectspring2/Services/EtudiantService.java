package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Departement;
import com.example.firstprojectspring2.DAO.Entities.Etudiant;
import com.example.firstprojectspring2.DAO.Repositories.DepartementRepo;
import com.example.firstprojectspring2.DAO.Repositories.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class EtudiantService implements IEtudiantService{
    @Autowired //@Injected
    private EtudiantRepo etudiantRepo;

    @Autowired //@Injected
    private DepartementRepo Drepo;

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public void deleteEtudiant(Etudiant e) {
        etudiantRepo.delete(e);
    }

    @Override
    public void delateEtudiantById(long id) {
        etudiantRepo.deleteById(id);
    }

    @Override
    public List<Etudiant> FindAllEtudiant() {
        return (List <Etudiant>) etudiantRepo.findAll();
    }

    @Override
    public Etudiant findById(Long id) {
        return etudiantRepo.findById(id).get();
    }
   /* @Override
    public List<Etudiant> searchContratByArchiveAndDateDebut(boolean ar, Date d){
        return etudiantRepo.findByEquipeListIdEquipeAndEquipeListDSalle(ar,d);
    }*/


    @Override
    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId){
     Etudiant etudiantaffecter= etudiantRepo.findById(Long.valueOf(etudiantId)).get();//parent (pas  de mappedBy)

     Departement departementaaffecter =  Drepo.findById(Long.valueOf(departementId)).get();//child
     //on affecte  le child au child
        etudiantaffecter.setDep(departementaaffecter);
        // pour la  persister  dans la base on  fait  appel au  save  du  parent
        etudiantRepo.save(etudiantaffecter);

    }

}
