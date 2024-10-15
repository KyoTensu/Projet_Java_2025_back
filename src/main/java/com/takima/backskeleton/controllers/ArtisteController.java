package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.services.ArtisteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Artiste getArtisteById(@PathVariable long id) { return artisteService.findById(id); }
}
