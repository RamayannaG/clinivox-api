package com.clinivox.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.clinivox.api.entities.Paciente;
import com.clinivox.api.repositories.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }


    public Paciente salvar(Paciente paciente) {
    return repository.save(paciente);
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }   
}

