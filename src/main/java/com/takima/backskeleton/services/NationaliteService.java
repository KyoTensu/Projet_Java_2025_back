package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.NationaliteDao;
import com.takima.backskeleton.models.Nationalite;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class NationaliteService {
    private final NationaliteDao nationaliteDao;

    public List<Nationalite> findAll() {
        return nationaliteDao.findAll();
    }
}
