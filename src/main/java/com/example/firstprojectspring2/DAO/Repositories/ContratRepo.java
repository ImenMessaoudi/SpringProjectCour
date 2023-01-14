package com.example.firstprojectspring2.DAO.Repositories;

import com.example.firstprojectspring2.DAO.Entities.Contrat;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepo extends CrudRepository <Contrat,Long > {

  // pour  la recuperation  les Key WORD (get ou find
  //Select * from contrat where archive =(valeur passé en  parametre  )

   List<Contrat> getByArchive(Boolean archive);



   List<Contrat>getByDateDebutC(Date dateDebutC);
   List<Contrat> getByPrix(Float prix);

   List<Contrat> findByArchive(Boolean archive);

    //Select * from contrat where archive =(param) and dateDebutC=(param)
    List<Contrat> getByArchiveAndDateDebutC (Boolean archive, Date date);

    //Select * from contrat where dateDebutc =()<dateDebutc =()
    List<Contrat> getByDateDebutCBetween(Date date1,Date date2);

    //afficher  la  liste  des  contrat d'un  etudiant  avec  l'Id  passé en parametre
    //JPQL
    @Query("select cont  from Contrat cont , Etudiant etud where" +
            " cont.e.idEtudiant=etud.idEtudiant and  etud.idEtudiant=?1")
    List<Contrat> searchByIdEtudiantJPQL(Long id);


    //SQL
    @Query(value = "select cont t_contat cont join etudiant etu " +
            "on cont.e_id_etudiant ",nativeQuery = true)
    List<Contrat> searchByIdEtudiantSQL(Long id);
}
