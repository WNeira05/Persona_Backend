package com.backend.personaBackend.service;

import com.backend.personaBackend.model.Pais;
import com.backend.personaBackend.repository.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService implements IPaisService{
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }
}
