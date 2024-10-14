package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.services.ArtisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("artistes")
@RestController
@RequiredArgsConstructor
public class ArtisteController {
    private final ArtisteService artisteService;

    @GetMapping("")
    public List<Artiste> getAllArtistes() {
        return artisteService.findAll();
    }
}
