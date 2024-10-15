package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.models.Concert;
import com.takima.backskeleton.models.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArtisteMapper {
    public static Artiste fromDto(ArtisteDto dto) throws IOException {
        return new Artiste.Builder()
                .id(dto.getId().longValue())
                .Name(dto.getName())
                .isGroup(dto.getIsGroupe())
                .birthdate(dto.getBirthDate())
                .utilisateurs(dto.getUtilisateurs())
                .style(dto.getStyle())
                .nationalite(dto.getNationalite())
                .build();
    }

    public static ArtisteDto toDto(Artiste artiste, List<Concert> concerts) throws IOException {
        return new ArtisteDto.ArtisteDtoBuilder()
                .id(artiste.getId().intValue())
                .name(artiste.getName())
                .isGroupe(artiste.getIsGroup())
                .birthDate(artiste.getBirthdate())
                .utilisateurs(artiste.getUtilisateurs())
                .style(artiste.getStyle())
                .nationalite(artiste.getNationalite())
                .concerts(concerts)
                .build();
    }
}
