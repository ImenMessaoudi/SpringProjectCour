package com.example.firstprojectspring2.DAO.Entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data // Guetter , setter , toString, Equals
// lors  de  l'assossiation  avec  les  autre  tables  ca  peux  generer  un PBM
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String prenomE;
    @Column(name="class")
    private String classE;
    private String nomE;
    private Domaine domaine;
    @ManyToOne
    private Departement dep;
    @ManyToMany(mappedBy = "etudiantList")
    List<Equipe> equipeList;
    @OneToMany (mappedBy = "e")
    List <Contrat>contratList;

}
