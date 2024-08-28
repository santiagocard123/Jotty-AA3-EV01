package com.example.demo.repository;

import com.example.demo.model.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Integer> {
}