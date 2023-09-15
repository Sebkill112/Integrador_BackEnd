package com.proyectoIntegrador.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalledevolucion")
public class DevolucionHasLibro implements Serializable {

	@EmbeddedId
	private DevolucionHasLibroPK pk;

	// Relación MUCHOS a UNO "Boleta"
	@ManyToOne
	@JoinColumn(name = "cod_devolucion", referencedColumnName = "cod_devolucion", insertable = false, updatable = false)
	private Devolucion devolucion;// ASOCI.

//Relación MUCHOS  a UNO "Medicamento"
	@ManyToOne
	@JoinColumn(name = "cod_libro", referencedColumnName = "cod_libro", insertable = false, updatable = false)
	private Libro libro;// ASOCI.

	public DevolucionHasLibroPK getPk() {
		return pk;
	}

	public void setPk(DevolucionHasLibroPK pk) {
		this.pk = pk;
	}

	public Devolucion getDevolucion() {
		return devolucion;
	}

	public void setDevolucion(Devolucion devolucion) {
		this.devolucion = devolucion;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
