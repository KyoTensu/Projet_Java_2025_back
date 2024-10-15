package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ArtisteDao;
import com.takima.backskeleton.DAO.ConcertDao;
import com.takima.backskeleton.DTO.ArtisteDto;
import com.takima.backskeleton.DTO.ArtisteMapper;
import com.takima.backskeleton.models.Artiste;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ArtisteService {
    private final ArtisteDao artisteDao;
    private final ConcertDao concertDao;

    public List<Artiste> findAll() {
        return artisteDao.findAll();
    }

    public ArtisteDto findById(long id) {
        if (artisteDao.findById(id).isPresent()) {
            try{
                return ArtisteMapper.toDto(artisteDao.findById(id).get(), concertDao.findConcertByArtist(id));
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }
}
