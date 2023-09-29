package com.proyectoIntegrador.interfaces;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoIntegrador.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Serializable> {

}
