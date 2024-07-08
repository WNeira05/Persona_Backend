package com.backend.personaBackend.controller;

import com.backend.personaBackend.model.Pais;
import com.backend.personaBackend.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises (){
        return ResponseEntity.ok(paisService.findAll());
    }
}
