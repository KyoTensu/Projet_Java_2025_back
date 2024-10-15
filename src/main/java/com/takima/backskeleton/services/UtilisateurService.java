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

    public Utilisateur findById(long id) {
        if(utilisateurDao.findById(id).isPresent()){
            return utilisateurDao.findById(id).get();
        }else {
            return null;
        }
    }
}
