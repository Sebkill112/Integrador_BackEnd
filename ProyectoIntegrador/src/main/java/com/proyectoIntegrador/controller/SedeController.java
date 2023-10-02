package com.proyectoIntegrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoIntegrador.entity.Libro;
import com.proyectoIntegrador.entity.Sede;
import com.proyectoIntegrador.service.LibroService;
import com.proyectoIntegrador.service.SedeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/sede")
@RequiredArgsConstructor
public class SedeController {
	
	@Autowired
	private SedeService servicio;
	
	@GetMapping(value = "listado")
	@ResponseBody
	public ResponseEntity<List<Sede>> listar(){
		List<Sede> lista = servicio.listadoSede();
		return ResponseEntity.ok(lista);
	}

}
