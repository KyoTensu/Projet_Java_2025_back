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
}
