package com.example.demo.service;

import com.example.demo.model.Mantenimiento;
import com.example.demo.repository.MantenimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoService {
    @Autowired
    private MantenimientoRepository mantenimientoRepository;

    public List<Mantenimiento> findAll() {
        return mantenimientoRepository.findAll();
    }

    public Mantenimiento save(Mantenimiento mantenimiento) {
        return mantenimientoRepository.save(mantenimiento);
    }

    public void deleteById(int id) {
        mantenimientoRepository.deleteById(id);
    }
}