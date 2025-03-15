package com.example.egas.com.controller;

import com.example.egas.com.model.Paciente;
import com.example.egas.com.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService service;

    @GetMapping
    public List<Paciente> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Paciente listarPorId(@PathVariable("id") Integer id){
        return service.listarPorId(id);
    }

    @PostMapping
    public ResponseEntity<Paciente> registrar(@RequestBody Paciente p){
        Paciente obj = service.registrar(p);

        return new ResponseEntity<Paciente>(obj, HttpStatus.CREATED);
    }

    @PutMapping
    public Paciente modificar(@RequestBody Paciente p){
        return service.modificar(p);
    }

    @DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id){
        service.eliminar(id);
    }






}
