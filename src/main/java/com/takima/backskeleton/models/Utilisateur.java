package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "utilisateurs")
@Getter
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utilisateur_id")
    private Long id;
    @Column(name = "utilisateur_firstname")
    private String firstName;
    @Column(name = "utilisateur_lastname")
    private String lastName;
    @Column(name = "utilisateur_password")
    private String password;
    @Column(name = "utilisateur_mail")
    private String mail;
//    @ManyToMany(mappedBy = "utilisateurs")
//            @JsonIgnore
//    List<Artiste> artistes;
    @ManyToMany(mappedBy = "utilisateurs")
    List<Concert> concerts;
}
