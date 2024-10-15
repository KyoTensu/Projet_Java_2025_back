package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "nationalite")
@Getter
public class Nationalite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nationalite_id")
    private Long id;
    @Column(name = "nationalite_name")
    private String name;
    @OneToMany
    @JoinColumn(name = "nationalite_id")
    @JsonIgnore
    private List<Artiste> artistes;
}
