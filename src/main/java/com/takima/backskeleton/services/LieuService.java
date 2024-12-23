package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.LieuDao;
import com.takima.backskeleton.models.Lieu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LieuService {
    private final LieuDao lieuDao;

    public List<Lieu> findAll() {
        return lieuDao.findAll();
    }

    public Lieu findById(Long id) {
        if(lieuDao.findById(id).isPresent()){
            return lieuDao.findById(id).get();
        }else {
            return null;
        }
    }
}
