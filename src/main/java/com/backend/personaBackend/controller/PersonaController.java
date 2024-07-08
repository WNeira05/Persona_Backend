package com.backend.personaBackend.controller;

import com.backend.personaBackend.model.Persona;
import com.backend.personaBackend.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // Método para obtener todas las personas
    @GetMapping
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personas = personaService.findAll();
        return ResponseEntity.ok(personas);
    }

    // Método para guardar una nueva persona
    @PostMapping
    public ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        try {
            Persona personaGuardada = personaService.save(persona);
            URI location = new URI("/personas/" + personaGuardada.getId());
            return ResponseEntity.created(location).body(personaGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // Método para eliminar una persona por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable("id") Long id) {
        boolean exists = personaService.deleteById(id);
        if (exists) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

