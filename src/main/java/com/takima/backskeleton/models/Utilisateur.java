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

    private Utilisateur(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.mail = builder.mail;
        this.concerts = builder.concerts;
    }

    public Utilisateur() {
    }

    public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String password;
        private String mail;
        List<Concert> concerts;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }
        public Builder concerts(List<Concert> concerts) {
            this.concerts = concerts;
            return this;
        }

        public Utilisateur build() {
            return new Utilisateur(this);
        }
    }
}