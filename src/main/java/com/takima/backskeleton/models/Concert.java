package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "concerts")
@Getter
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_id")
    private Long id;
    @Column(name = "concert_date_debut")
    private Instant debut;
    @Column(name = "concert_date_fin")
    private Instant fin;
    @Column(name = "concert_name")
    private String concertName;
    @ManyToOne
    @JoinColumn(name = "lieu_id")
    private Lieu lieu;
    @ManyToMany
    @JoinTable(
            name = "concert_favoris",
            joinColumns = @JoinColumn(name = "concert_id"),
            inverseJoinColumns = @JoinColumn(name = "utilisateur_id")
    )
    private List<Utilisateur> utilisateurs;
    @ManyToMany
    @JoinTable(
            name = "artistes_concert",
            joinColumns = @JoinColumn(name = "concert_id"),
            inverseJoinColumns = @JoinColumn(name = "artiste_id")
    )
    private List<Artiste> artistes;
}
