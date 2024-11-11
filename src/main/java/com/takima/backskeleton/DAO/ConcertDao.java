package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.models.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConcertDao extends JpaRepository<Concert, Long> {
    @Query("SELECT c FROM Concert c JOIN c.artistes a WHERE a.id = :artisteId")
    List<Concert> findConcertByArtistId(Long artisteId);
}
