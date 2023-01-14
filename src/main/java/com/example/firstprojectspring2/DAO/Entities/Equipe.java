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


public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipe;
    private String nomEquipe;
    private Niveau niveau;
    @OneToOne
    private DetailEquipe d ;
    @ManyToMany(cascade = CascadeType.ALL)
    List<Etudiant>etudiantList;
}
