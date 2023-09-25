package com.proyectoIntegrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoIntegrador.entity.Prestamo;
import com.proyectoIntegrador.entity.PrestamoHasLibro;
import com.proyectoIntegrador.service.PrestamoHasLibroService;
import com.proyectoIntegrador.service.prestamoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/prestamo")
@RequiredArgsConstructor
public class PrestamoController {
	
	
	@Autowired
	private prestamoService servicio;
	
	@Autowired
	private PrestamoHasLibroService servicioDetalle;
	
	@PostMapping(value = "registro")
	@ResponseBody
	public ResponseEntity<String> registrarPrestamo(@RequestBody Prestamo prestamo) {
        // Primero, guarda el préstamo en la base de datos
        Prestamo prestamoGuardado = servicio.registrar(prestamo);
        
        // Luego, asocia los detalles de préstamo al préstamo y guárdalos en la base de datos
        for (PrestamoHasLibro detalle : prestamo.getDetallePrestamo()) {
            detalle.setPrestamo(prestamoGuardado);
            servicioDetalle.grabar(detalle);
        }
        
        // Lógica para enviar un correo electrónico aquí
        // Utiliza tu servicio de correo electrónico configurado previamente
        
        return ResponseEntity.ok("Préstamo registrado exitosamente.");
    }
	
	
	@GetMapping(value = "listado")
	@ResponseBody
	public ResponseEntity<List<Prestamo>> listar(){
		List<Prestamo> lista = servicio.listarTodo();
		return ResponseEntity.ok(lista);
	}
}
