package com.proyectoIntegrador.entity;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleprestamo")
public class PrestamoHasLibro implements Serializable {
	
	@EmbeddedId
	private PrestamoHasLibroPK pk;
	
	//Relación MUCHOS  a UNO "Boleta"
			@ManyToOne
			@JoinColumn(name="cod_prestamo",referencedColumnName = "cod_prestamo",insertable = false,updatable =false)
			private Prestamo prestamo;//ASOCI.
	
	//Relación MUCHOS  a UNO "Medicamento"
		@ManyToOne
		@JoinColumn(name="cod_libro",referencedColumnName = "cod_libro",insertable = false,updatable =false)
		private Libro libro;//ASOCI.

		public PrestamoHasLibroPK getPk() {
			return pk;
		}

		public void setPk(PrestamoHasLibroPK pk) {
			this.pk = pk;
		}

		public Prestamo getPrestamo() {
			return prestamo;
		}

		public void setPrestamo(Prestamo prestamo) {
			this.prestamo = prestamo;
		}

		public Libro getLibro() {
			return libro;
		}

		public void setLibro(Libro libro) {
			this.libro = libro;
		}
		
		
	

}
