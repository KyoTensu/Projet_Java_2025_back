package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.StyleDao;
import com.takima.backskeleton.models.Style;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StyleService {
    private final StyleDao styleDao;

    public List<Style> findAll() {
        return styleDao.findAll();
    }
}
