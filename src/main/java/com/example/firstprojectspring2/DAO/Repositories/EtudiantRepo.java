package com.example.firstprojectspring2.DAO.Repositories;

import com.example.firstprojectspring2.DAO.Entities.Etudiant;
import com.example.firstprojectspring2.DAO.Entities.Niveau;
import com.example.firstprojectspring2.Services.IEtudiantService;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface EtudiantRepo extends CrudRepository<Etudiant,Long> {
    //uniquement  des requettes Select
    List <Etudiant> findByEquipeListIdEquipe(Long id);
    List <Etudiant> findByEquipeListIdEquipeAndEquipeListDSalle(boolean idEquipe, Date salle);
    //findBy
    //getBy

    //SQL : on fait appel aux Nom des tabls et les nom des colones sur la base
    @Query(value = "SELECT * from etudiant  where nome=?1  and prenome =?2", nativeQuery = true)//l'ordre est  tres  important
    Etudiant getStudentInParamSQL(String nom, String prenom);

    //JPQl

    @Query("select e from  Etudiant e where e.classE=?1")
    List <Etudiant> searchEtudiantyClass(String c);


    //SQL
    @Query(value = "select * from Student where class=:c", nativeQuery = true)
    List<Etudiant> searchStudentyClass(String c);

    @Query(value = "select var1 from etudiant var1 join equipe_etudiant_list var2 on var2.etudiant_list_id_etudiant = var1.id_etudiant" +
            "join equipe var3 on var2.equipe_list_id_equipe= var3.id_equipe where var3.niveau =: niv ",nativeQuery = true)
    List<Etudiant> fetchStudentWhenLevelInParamSQL(@Param(value = "niv") Niveau niv );


    // supprimer Etudiant avec  le   le non et  prenon passer  en parametre

    @Modifying
    @Query("delete from Etudiant where nomE=: nom and prenomE=: prenom")
    void suprimerStudentJPQL(@Param(value = "nom") String nom,@Param(value = "prenom") String prenon);


    @Modifying // une  foi  quant  va  modifier la  base  de donnés
    @Query(value = "delete from etudiant where nome=: nom and prenome=: prenom",nativeQuery = true)
    void suprimerStudentSql();
}
