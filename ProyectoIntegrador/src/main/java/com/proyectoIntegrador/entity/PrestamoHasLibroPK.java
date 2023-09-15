package com.proyectoIntegrador.entity;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PrestamoHasLibroPK implements Serializable {

	@Column(name = "cod_prestamo")
	private int codigoPrestamo;
	@Column(name = "cod_libro")
	private int codigoLibro;

	public int getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(int codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoLibro;
		result = prime * result + codigoPrestamo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrestamoHasLibroPK other = (PrestamoHasLibroPK) obj;
		if (codigoLibro != other.codigoLibro)
			return false;
		if (codigoPrestamo != other.codigoPrestamo)
			return false;
		return true;
	}

	
}
