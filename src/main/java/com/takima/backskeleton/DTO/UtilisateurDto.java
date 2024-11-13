package com.takima.backskeleton.DTO;

import com.takima.backskeleton.models.Concert;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class UtilisateurDto {
    private String firstName;
    private String lastName;
    private String password;
    private String mail;
    private List<Concert> concerts;
}
