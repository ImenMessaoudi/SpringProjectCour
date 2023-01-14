package com.example.firstprojectspring2.DAO.Entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniversite;
    @OneToMany(cascade = CascadeType.ALL)
    List<Departement> departements;
}
