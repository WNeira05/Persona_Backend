package com.backend.personaBackend.service;

import com.backend.personaBackend.model.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Persona> findAll();


    public <S extends Persona> S save(S entity);

    public Optional<Persona> findById(Long id);

    public Boolean deleteById(Long id);

    public void delete(Persona entity);
}
