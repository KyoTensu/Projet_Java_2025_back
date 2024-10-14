package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Concert;
import com.takima.backskeleton.services.ConcertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("concerts")
@RestController
@RequiredArgsConstructor
public class ConcertController {
    private final ConcertService concertService;

    @GetMapping("")
    public List<Concert> getAllConcerts() {
        return concertService.findAll();
    }
}
