package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "artistes")
@Getter
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "artiste_name")
    private String name;
    @Column(name = "artist_is_group")
    private Boolean isGroup;
    private Instant birthdate;
    @ManyToMany
    @JoinTable(
            name = "artiste_favoris",
            joinColumns = @JoinColumn(name = "artiste_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateur> utilisateurs;
    @ManyToOne
    @JoinColumn(name = "style_id")
    private Style style;
    @ManyToOne
    @JoinColumn(name = "nationalite_id")
    private Nationalite nationalite;

    private Artiste(Artiste.Builder builder) {
        this.id = builder.id;
        this.name = builder.Name;
        this.isGroup = builder.isGroup;
        this.birthdate = builder.birthdate;
        this.utilisateurs = builder.utilisateurs;
        this.style = builder.style;
        this.nationalite = builder.nationalite;
    }
    public Artiste() {
    }

    public static class Builder {
        private Long id;
        private String Name;
        private Boolean isGroup;
        private Instant birthdate;
        private List<Utilisateur> utilisateurs;
        private Style style;
        private Nationalite nationalite;

        public Artiste.Builder id (Long id) {
            this.id = id;
            return this;
        }

        public Artiste.Builder Name(String Name) {
            this.Name = Name;
            return this;
        }
        public Artiste.Builder isGroup(Boolean isGroup) {
            this.isGroup = isGroup;
            return this;
        }
        public Artiste.Builder utilisateurs(List<Utilisateur> utilisateurs) {
            this.utilisateurs = utilisateurs;
            return this;
        }
        public Artiste.Builder style(Style style) {
            this.style = style;
            return this;
        }
        public Artiste.Builder birthdate(Instant birthdate) {
            this.birthdate = birthdate;
            return this;
        }
        public Artiste.Builder nationalite(Nationalite nationalite) {
            this.nationalite = nationalite;
            return this;
        }

        public Artiste build() {
            return new Artiste(this);
        }
    }
}
