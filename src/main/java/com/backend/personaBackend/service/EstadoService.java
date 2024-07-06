package com.backend.personaBackend.service;

import com.backend.personaBackend.model.Estado;
import com.backend.personaBackend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService implements IEstadoService{

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    @Override
    public List<Estado> findAllByCountry(Long id) {
        List<Estado> estadosRespuesta= new ArrayList<>();
        List<Estado> estados= estadoRepository.findAll();
        for (Estado estado : estados) {
            if (estado.getPais().getId() == id) {
                estadosRespuesta.add(estado);
            }
        }
        return estadosRespuesta;
    }
}
