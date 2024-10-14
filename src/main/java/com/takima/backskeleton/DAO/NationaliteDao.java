package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Nationalite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationaliteDao extends JpaRepository<Nationalite, Long> {
}
