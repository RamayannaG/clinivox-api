package com.clinivox.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinivox.api.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
