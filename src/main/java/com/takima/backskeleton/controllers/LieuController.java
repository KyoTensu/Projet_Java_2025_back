package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Lieu;
import com.takima.backskeleton.services.LieuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("Lieux")
@RestController
@RequiredArgsConstructor
public class LieuController {
    private final LieuService lieuService;

    @GetMapping("")
    public List<Lieu> getAllLieux() {
        return lieuService.findAll();
    }

    @GetMapping("/{id}")
    public Lieu getLieu(@PathVariable long  id) {return lieuService.findById(id);}
}
