package com.example.firstprojectspring2.DAO.Repositories;

import com.example.firstprojectspring2.DAO.Entities.Equipe;
import com.example.firstprojectspring2.DAO.Entities.Specialite;
import com.example.firstprojectspring2.DAO.Entities.Universite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquipeRepo extends CrudRepository<Equipe,Long> {


    //Afficher la  liste  des  equipe  avec  une  thematique  passé  en  parametre
    //JPQL
    @Query("select aliasE from Equipe aliasE,DetailEquipe aliasDe where" +
            " aliasE.d.idDetailEquipe= aliasDe.idDetailEquipe and aliasDe.thematique=?1")
    List<Equipe> retreveEquipeByThematiqueJPQL( String thematique);

    //SQL
    @Query(value = "select equipe from equipe  join detail_equipe detailEquipe " +
            "on detailEquipe.id_detail_equipe= equipe.id_detail_equipe where " +
            " detailEquipe.thematique=?1",nativeQuery = true)
    List<Equipe> retreveEquipeByThematiqueSQL( String thematique);





}
