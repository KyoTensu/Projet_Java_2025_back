package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "utilisateurs")
@Getter
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "utilisateur_firstname")
    private String firstName;
    @Column(name = "utilisateur_lastname")
    private String lastName;
    private String password;
    private String mail;
    @ManyToMany(mappedBy = "utilisateurs")
    List<Artiste> artistes;
    @ManyToMany(mappedBy = "utilisateurs")
    List<Concert> concerts;
}
