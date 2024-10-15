package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "style")
@Getter
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "style_id")
    private Long id;
    @Column(name = "style_name")
    private String name;
    @Column(name = "style_description")
    private String description;
    @OneToMany
    @JoinColumn(name = "style_id")
    @JsonIgnore
    private List<Artiste> artistes;
}
