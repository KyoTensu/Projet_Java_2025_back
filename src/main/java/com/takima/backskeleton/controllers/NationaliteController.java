package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Nationalite;
import com.takima.backskeleton.services.NationaliteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("nationalities")
@RestController
@RequiredArgsConstructor
public class NationaliteController {
    private final NationaliteService nationaliteService;

    @GetMapping("")
    public List<Nationalite> getAllNationalites() {
        return nationaliteService.findAll();
    }

    @GetMapping("/{id}")
    public Nationalite getNationaliteById(@PathVariable long id) {return nationaliteService.findById(id);}
}
