package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "nationalite")
@Getter
public class Nationalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String flag;
    @OneToMany
    private List<Artiste> artistes;
}
