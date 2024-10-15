package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "lieux")
@Getter
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lieu_id")
    private Long id;
    @Column(name = "lieu_capacity")
    private Integer capacity;
    @Column(name = "lieu_name")
    private String name;
    @OneToMany
    @JoinColumn(name = "lieu_id")
    @JsonIgnore
    private List<Concert> concerts;
}
