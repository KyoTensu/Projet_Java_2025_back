package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Style;
import com.takima.backskeleton.services.StyleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
