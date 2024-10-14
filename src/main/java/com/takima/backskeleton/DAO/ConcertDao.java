package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertDao extends JpaRepository<Concert, Long> {
}
