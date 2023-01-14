package com.example.firstprojectspring2.Services;

import com.example.firstprojectspring2.DAO.Entities.Contrat;
import com.example.firstprojectspring2.DAO.Entities.Etudiant;
import com.example.firstprojectspring2.DAO.Repositories.ContratRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
@Slf4j
@Service
public class ContratService implements IContratService{
    @Autowired //@Injected
    private ContratRepo contratRepo;


    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepo.save(c); //add  if id  =  null
    }

    @Override
    public Contrat UpdateContrat(Contrat c) {
        return contratRepo.save(c); //save() if  id
    }

    @Override
    public void deleteContrat(Contrat c) {
        contratRepo.delete(c);
    }

    @Override
    public void deleteContratById(Long id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> findAllContrat() {
        return  (List<Contrat>) contratRepo.findAll();
    }

    @Override
    public List<Contrat> searchContratByPrix(float p){
        return contratRepo.getByPrix(p);
    }

    @Override
    public String retrieveAndUpdateStatusContrat() {
        List<Contrat>  contratsVerif = contratRepo.getByArchive(false);
        String msg="";
        for (Contrat c :contratsVerif) {
            if(calculDiff(c.getDateFinC(), new Date())==0){
                c.setArchive(true);
                contratRepo.save(c);
                // avoir  le  message  sur  le  log

                log.info("le contrat " +
                        c.getIdContrat() +
                        "de l'étudiant" +
                        c.getE().getNomE()+
                        "est expiré"
                );

            } else if (calculDiff(c.getDateFinC(), new Date()) +1==15) {
                msg += "le  contrat "+c.getIdContrat()+ "va expiré dans  15  jours";
            }

        }

        return msg;

    }

    @Override
    public List<Contrat> addContrats(List<Contrat> listC) {
        List <Contrat>  list = (List<Contrat>) contratRepo.findAll();
        list.addAll(listC);
        return list;
    }

    public long calculDiff(Date date1, Date date2) {
        long diffInMillies = date1.getTime() - date2.getTime();
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    @Override
    public Contrat findContratById(Long id) {
        return contratRepo.findById(id).get(); /// if  Objet existe  elle  retourne  l'objet  sinn elle retourn  un  objet NULL
    }

    @Override
    public List<Contrat> searchContratByArchive(Boolean ar) {
        return contratRepo.getByArchive(ar);
    }

    @Override
    public List<Contrat> searchContratByDateDebutC(Date ddc) {
        return contratRepo.getByDateDebutC(ddc);
    }

    @Override
    public List<Contrat> searchContratByArchiveAndDateDebut(boolean ar, Date d){
        return contratRepo.getByArchiveAndDateDebutC(ar,d);
    }


}
