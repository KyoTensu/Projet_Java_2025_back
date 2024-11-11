package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.ArtisteDto;
import com.takima.backskeleton.models.Artiste;
import com.takima.backskeleton.models.Concert;
import com.takima.backskeleton.services.ArtisteService;
import com.takima.backskeleton.services.ConcertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("artistes")
@RestController
@RequiredArgsConstructor
public class ArtisteController {
    private final ArtisteService artisteService;
    private final ConcertService concertService;

    @GetMapping("")
    public List<Artiste> getAllArtistes() {
        return artisteService.findAll();
    }

    @GetMapping("/{id}")
    public ArtisteDto getArtisteById(@PathVariable Long id) { return artisteService.findById(id); }
}
