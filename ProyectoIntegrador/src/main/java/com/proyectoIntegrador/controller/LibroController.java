package com.proyectoIntegrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoIntegrador.entity.Libro;
import com.proyectoIntegrador.entity.Prestamo;
import com.proyectoIntegrador.service.LibroService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/libro")
@RequiredArgsConstructor
public class LibroController {
	
	@Autowired
	private LibroService servicio;
	
	@GetMapping(value = "listado")
	@ResponseBody
	public ResponseEntity<List<Libro>> listar(){
		List<Libro> lista = servicio.listadoLibros();
		return ResponseEntity.ok(lista);
	}

}
