package com.example.egas.com.service.impl;

import com.example.egas.com.model.Paciente;
import com.example.egas.com.repo.IPacienteRepo;
import com.example.egas.com.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements IPacienteService {

    @Autowired
    private IPacienteRepo repo;

    @Override
    public Paciente registrar(Paciente p) {
        return repo.save(p);
    }

    @Override
    public Paciente modificar(Paciente p) {
        return repo.save(p);
    }

    @Override
    public List<Paciente> listar() {
        return repo.findAll();
    }

    @Override
    public Paciente listarPorId(Integer id) {
        Optional<Paciente> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Paciente();
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
