package com.proyectoIntegrador.entity;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class PrestamoHasLibroPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "cod_prestamo")
	private int codigoPrestamo;
	@Column(name = "cod_libro")
	private int codigoLibro;

	

	
}
