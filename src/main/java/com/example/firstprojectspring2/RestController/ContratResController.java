package com.example.firstprojectspring2.RestController;

import com.example.firstprojectspring2.DAO.Entities.Contrat;
import com.example.firstprojectspring2.DAO.Entities.Etudiant;
import com.example.firstprojectspring2.Services.IContratService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("contrat") // pour  pouvoir personnaliser l'acces au Rest Controller  specifique

public class ContratResController {
    @Autowired
    private IContratService iContratService;

    @PostMapping("ajouterC")
    Contrat ajouterContrat(@RequestBody Contrat c ){
       return iContratService.addContrat(c);
    }

    @PutMapping("modifierC")
    Contrat modifierContrat(@RequestBody Contrat c ){
        return iContratService.UpdateContrat(c);
    }

    @DeleteMapping("suprimerC")
   void suprimerContrat( @RequestBody Contrat c){
       iContratService.deleteContrat(c);
   }

    @DeleteMapping("suprimerParIdC/{id}")
    void deleteContratById(@PathVariable Long id){
        iContratService.deleteContratById(id);
    }

    @GetMapping("findAllC")
    List<Contrat> findAllContrat(){
      return iContratService.findAllContrat();
    }

    @GetMapping("findCById")
     Contrat findContratById(@RequestParam  Long id){
        return iContratService.findContratById(id);
    }

     @GetMapping("searchByArchive")
    List <Contrat> findByArchive(@RequestParam Boolean ar){
        return  iContratService.searchContratByArchive(ar);
     }

    @GetMapping(value = "searchByPrice/{p}")
    List <Contrat> findByPrix(@PathVariable float p){
        return  iContratService.searchContratByPrix(p);
    }

     @GetMapping("searchByArchiveAndDateD")
    List<Contrat> searchByArchiveAndDateD(@RequestParam boolean ar, @RequestParam Date d){
         return  iContratService.searchContratByArchiveAndDateDebut(ar,d);
     }

    @GetMapping("searchDateDebutC")
     List<Contrat> chercherByDateDebutC(@RequestParam Date d){
        return iContratService.searchContratByDateDebutC(d);
     }


    @PostMapping("ajouterListC")
    List<Contrat> addContratsList(@RequestParam List<Contrat> list){
        return iContratService.addContrats(list);
    }
}

