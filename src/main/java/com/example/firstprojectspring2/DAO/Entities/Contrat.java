package com.example.firstprojectspring2.DAO.Entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "Contat")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Contrat implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idContrat;
        @Temporal(TemporalType.DATE)
        private Date dateDebutC;
        @Temporal(TemporalType.DATE)
        private Date dateFinC;
        private Boolean archive;
        private float montantC;
        @Enumerated(EnumType.STRING)
        private Specialite specialite;
        //@Transient :  on  ne  peux  pas  travailler avec  elle  dans la  base de  donnes
        //un  attribut qui existe  dans  l'entite
        private float prix ;
        @ManyToOne
        private Etudiant e;


}
