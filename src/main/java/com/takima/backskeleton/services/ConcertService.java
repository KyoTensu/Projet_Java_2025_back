package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ConcertDao;
import com.takima.backskeleton.models.Concert;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConcertService {
    private final ConcertDao concertDao;

    public List<Concert> findAll() {
        return concertDao.findAll();
    }
}
