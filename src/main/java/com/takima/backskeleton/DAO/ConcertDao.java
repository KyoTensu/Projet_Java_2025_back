package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConcertDao extends JpaRepository<Concert, Long> {
    @Query("SELECT Concert FROM Concert WHERE artistes = :artisteId")
    List<Concert> findConcertByArtist(long artisteId);
}
