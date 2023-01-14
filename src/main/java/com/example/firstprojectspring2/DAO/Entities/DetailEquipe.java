package com.example.firstprojectspring2.DAO.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailEquipe;
    private int salle;
    private String thematique;

    @OneToOne (mappedBy = "d")
    private Equipe e;

}
