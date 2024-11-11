package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Style;
import com.takima.backskeleton.services.StyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("styles")
@RestController
@RequiredArgsConstructor
public class StyleController {
    private final StyleService styleService;

    @GetMapping("")
    public List<Style> getAllStyles() {
        return styleService.findAll();
    }

    @GetMapping("/{id}")
    public Style getStyleById(@PathVariable Long id) {return styleService.findById(id);}
}
