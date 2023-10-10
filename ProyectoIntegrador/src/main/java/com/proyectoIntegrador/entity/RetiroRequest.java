package com.proyectoIntegrador.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RetiroRequest {

	private String estado;
	private String numPrestamo;
	private String observacion;
	
}
