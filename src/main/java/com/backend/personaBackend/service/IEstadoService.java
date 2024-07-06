package com.backend.personaBackend.service;

import com.backend.personaBackend.model.Estado;

import java.util.List;

public interface IEstadoService {
    public List<Estado> findAll();

    public List<Estado> findAllByCountry (Long id);
}
