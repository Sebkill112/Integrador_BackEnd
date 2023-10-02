package com.proyectoIntegrador.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoIntegrador.entity.Libro;

public interface LibroRespository extends JpaRepository<Libro, Integer>{
	
	

}
