package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ArtisteDao;
import com.takima.backskeleton.models.Artiste;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ArtisteService {
    private final ArtisteDao artisteDao;

    public List<Artiste> findAll() {
        return artisteDao.findAll();
    }

    public Artiste findById(long id) {
        if (artisteDao.findById(id).isPresent()) {
            return artisteDao.findById(id).get();
        } else {
            return null;
        }
    }
}
