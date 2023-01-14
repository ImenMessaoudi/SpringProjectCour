package com.example.firstprojectspring2.RestController;

import com.example.firstprojectspring2.DAO.Entities.Etudiant;
import com.example.firstprojectspring2.Services.IContratService;
import com.example.firstprojectspring2.Services.IEtudiantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
@RestController
public class EtudiantResController {

    private IEtudiantService IEtudiantService;

   /* @GetMapping("searchByArchiveAndDateD")
    List<Etudiant> searchByArchiveAndDateD(@RequestParam boolean ar, @RequestParam Date d){
        return  IEtudiantService.searchContratByArchiveAndDateDebut(ar,d);
    }*/

    @PutMapping("affecterEtudiant")
    void affecterEtudiantToDepartment(@RequestParam Integer etudiantId, @RequestParam Integer departementId){
        IEtudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }
}
