package com.proyectoIntegrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoIntegrador.entity.Prestamo;
import com.proyectoIntegrador.interfaces.PrestamoRepository;

@Service
public class prestamoService {

	@Autowired
	private PrestamoRepository repo;
	
	public Prestamo registrar (Prestamo p) {
		return repo.save(p);
	}
	
	public List<Prestamo> listarTodo() {
		return repo.findAll();
	}
	
	
	
	
}
