package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Utilisateur;

import java.io.IOException;

public class UtilisateurMapper {
    public static Utilisateur fromDto(UtilisateurDto dto, Long id) throws IOException {
        return new Utilisateur.Builder()
                .id(id)
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .password(dto.getPassword())
                .mail(dto.getMail())
                .concerts(dto.getConcerts())
                .build();
    }

    public static UtilisateurDto toDto(Utilisateur utilisateur) {
        return UtilisateurDto.builder()
                .firstName(utilisateur.getFirstName())
                .lastName(utilisateur.getLastName())
                .password(utilisateur.getPassword())
                .mail(utilisateur.getMail())
                .concerts(utilisateur.getConcerts())
                .build();
    }
}
