package com.example.egas.com.service;

import com.example.egas.com.model.Paciente;

import java.util.List;

public interface IPacienteService {

    Paciente registrar(Paciente p);
    Paciente modificar(Paciente p);
    List<Paciente> listar();
    Paciente listarPorId(Integer id);
    void eliminar(Integer id);
}
