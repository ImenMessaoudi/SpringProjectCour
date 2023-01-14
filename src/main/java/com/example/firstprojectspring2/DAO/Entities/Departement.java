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
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long idDepartement;
    private String nomDepartement;
    @OneToMany (mappedBy = "dep")
    List<Etudiant> etudiantList;
}
