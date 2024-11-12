package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    @Query("SELECT u FROM Utilisateur u WHERE u.mail = :mail AND u.password = :password")
    Utilisateur findUtilisateurByMailAndPassword(String mail, String password);
}
