package com.example.demo.controller;

import com.example.demo.model.Mantenimiento;
import com.example.demo.service.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mantenimientos")
public class MantenimientoController {
    @Autowired
    private MantenimientoService mantenimientoService;

    @GetMapping
    public List<Mantenimiento> getAll() {
        return mantenimientoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Mantenimiento> create(@RequestBody Mantenimiento mantenimiento) {
        return ResponseEntity.ok(mantenimientoService.save(mantenimiento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        mantenimientoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}