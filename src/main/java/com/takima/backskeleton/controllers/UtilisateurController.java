package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Utilisateur;
import com.takima.backskeleton.services.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("utilisateurs")
@RestController
@RequiredArgsConstructor
public class UtilisateurController {
    private final UtilisateurService utilisateurService;

    @GetMapping("")
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    public Utilisateur getUtilisateurById(@PathVariable Long id) {return utilisateurService.findById(id);}
}
