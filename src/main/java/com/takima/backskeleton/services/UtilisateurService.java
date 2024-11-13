package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.UtilisateurDao;
import com.takima.backskeleton.DTO.UtilisateurDto;
import com.takima.backskeleton.DTO.UtilisateurMapper;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class UtilisateurService {
    private final UtilisateurDao utilisateurDao;

    public List<Utilisateur> findAll() {
        return utilisateurDao.findAll();
    }

    public Utilisateur findById(Long id) {
        if(utilisateurDao.findById(id).isPresent()){
            return utilisateurDao.findById(id).get();
        }else {
            return null;
        }
    }

    public Utilisateur findUtilisateurByMailAndPassword(String mail, String password) {
        if(utilisateurDao.findUtilisateurByMailAndPassword(mail, password) != null) {
            return utilisateurDao.findUtilisateurByMailAndPassword(mail, password);
        }else {
            return null;
        }
    }

    @Transactional
    public void addUtilisateur(UtilisateurDto utilisateurDto) {
        Utilisateur utilisateur;
        try {
            utilisateur = UtilisateurMapper.fromDto(utilisateurDto, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with utilisateur image", e);
        }

        utilisateurDao.save(utilisateur);
    }

    @Transactional
    public void deleteById(Long id) {
        utilisateurDao.deleteById(id);
    }

    @Transactional
    public void updateUtilisateur(UtilisateurDto utilisateurDto, Long id) {
        utilisateurDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Utilisateur doesn't exist"));
        Utilisateur utilisateur;
        try {
            utilisateur = UtilisateurMapper.fromDto(utilisateurDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Utilisateur image", e);
        }
        utilisateurDao.save(utilisateur);
    }
}
