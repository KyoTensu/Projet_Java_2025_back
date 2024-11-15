package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.UtilisateurDto;
import com.takima.backskeleton.models.Utilisateur;
import com.takima.backskeleton.services.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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

    @GetMapping("/authentification/{mail}/{password}")
    public Utilisateur getUtilisateurByMailAndPassword(@PathVariable String mail, @PathVariable String password) {
        return utilisateurService.findUtilisateurByMailAndPassword(mail, password);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteById(id);
    }

    @PostMapping("")
    public void addUtilisateur(@RequestBody UtilisateurDto utilisateurDto) {
        utilisateurService.addUtilisateur(utilisateurDto);
    }

    @PostMapping("/{id}")
    public void updateUtilisateur(@RequestBody UtilisateurDto utilisateurDto, @PathVariable Long id) {
        utilisateurService.updateUtilisateur(utilisateurDto, id);
    }
}
