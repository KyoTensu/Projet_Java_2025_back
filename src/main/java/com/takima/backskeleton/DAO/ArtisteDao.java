package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtisteDao extends JpaRepository<Artiste, Long> {
}
