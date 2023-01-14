package com.example.firstprojectspring2.RestController;

import com.example.firstprojectspring2.Services.IUniversiteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversitéResController {

    private IUniversiteService interfaceUniv;

    @PutMapping("affecterUniv")
    void  affecterUnivAuDepartement(@RequestParam Integer idUniv, @RequestParam Integer idDep){
        interfaceUniv.assignUniversiteToDepartement(idUniv,idDep);
    }


}
