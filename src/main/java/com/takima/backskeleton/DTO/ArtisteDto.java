package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Concert;
import com.takima.backskeleton.models.Nationalite;
import com.takima.backskeleton.models.Style;
import com.takima.backskeleton.models.Utilisateur;
import lombok.Builder;
import lombok.Getter;

import java.awt.*;
import java.time.Instant;
import java.util.List;

@Builder
@Getter
public class ArtisteDto {
    private Integer id;
    private String name;
    private Boolean isGroupe;
    private Instant birthDate;
//    private List<Utilisateur> utilisateurs;
    private Style style;
    private Nationalite nationalite;
    private List<Concert> concerts;
}
