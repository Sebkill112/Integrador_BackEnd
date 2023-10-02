package com.proyectoIntegrador.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoIntegrador.entity.Devolucion;
import com.proyectoIntegrador.interfaces.DevolucionRepository;

@Service
public class DevolucionService {

	@Autowired
	private DevolucionRepository repo;
	
	public List<Devolucion> listarDevolucion () {
		return repo.findAll();
	}
}
