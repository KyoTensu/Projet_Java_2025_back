package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "lieux")
@Getter
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer capacity;
    private String name;
    @OneToMany
    private List<Concert> concerts;
}
