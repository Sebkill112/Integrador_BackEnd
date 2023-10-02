package com.proyectoIntegrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoIntegrador.entity.Devolucion;
import com.proyectoIntegrador.entity.Prestamo;
import com.proyectoIntegrador.service.DevolucionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/devolucion")
@RequiredArgsConstructor
public class DevolucionController {
	
	
	@Autowired
	private DevolucionService serDevolucion;
	
	@GetMapping(value = "listado")
	@ResponseBody
	public ResponseEntity<List<Devolucion>> listar(){
		List<Devolucion> lista = serDevolucion.listarDevolucion();
		return ResponseEntity.ok(lista);
	}

}
