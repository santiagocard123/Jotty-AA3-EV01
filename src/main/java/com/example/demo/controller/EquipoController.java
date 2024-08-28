package com.example.demo.controller;

import com.example.demo.model.Equipo;
import com.example.demo.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> getAll() {
        return equipoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Equipo> create(@RequestBody Equipo equipo) {
        return ResponseEntity.ok(equipoService.save(equipo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        equipoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}