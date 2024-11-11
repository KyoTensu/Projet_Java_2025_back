package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.models.Utilisateur;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ConcertDto {
    private Long id;
    private Lieu lieu;
    private List<Utilisateur> utilisateurs;
    private List<Artiste> artistes;
}
