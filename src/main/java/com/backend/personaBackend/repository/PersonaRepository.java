package com.backend.personaBackend.repository;

import com.backend.personaBackend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
