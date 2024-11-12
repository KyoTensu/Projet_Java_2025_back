package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.UtilisateurDao;
import com.takima.backskeleton.models.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

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
}
