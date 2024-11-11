package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ArtisteDao;
import com.takima.backskeleton.DAO.ConcertDao;
import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.models.Concert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ConcertService {
    private final ConcertDao concertDao;
    private final ArtisteDao artisteDao;

    public List<Concert> findAll() {
        return concertDao.findAll();
    }

    public Concert findById(Long id) {
        if(concertDao.findById(id).isPresent()){
            return concertDao.findById(id).get();
        }else {
            return null;
        }
    }

    public List<Concert> findConcertsByArtisteId(Long id) {
        if(artisteDao.findById(id).isPresent()){
            return concertDao.findConcertByArtistId(id);
        }else {
            return null;
        }

    }

}
