package com.proyectoIntegrador.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoIntegrador.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {

}
