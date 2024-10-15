package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Concert;
import com.takima.backskeleton.services.ConcertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Concert getConcertById(@PathVariable long id) {return concertService.findById(id);}
}
