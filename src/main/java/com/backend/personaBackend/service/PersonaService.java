package com.backend.personaBackend.service;

import com.backend.personaBackend.model.Persona;
import com.backend.personaBackend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }


    public Boolean deleteById(Long id) {
        try {
            personaRepository.deleteById(id);
            return true;
        } catch (EmptyResultDataAccessException e) {
            return false;
        }
    }

    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }


}
