package com.clinivox.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinivox.api.entities.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}