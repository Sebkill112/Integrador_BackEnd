package com.proyectoIntegrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoIntegrador.entity.Libro;
import com.proyectoIntegrador.interfaces.LibroRespository;

@Service
public class LibroService {

	
	@Autowired
	private LibroRespository repo;
	
	public List<Libro> listadoLibros () {
		
		return repo.findAll();
	}
}
