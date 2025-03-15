package com.example.egas.com.repo;

import com.example.egas.com.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {
}
