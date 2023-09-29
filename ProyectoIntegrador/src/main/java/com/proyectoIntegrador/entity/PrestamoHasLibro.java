package com.proyectoIntegrador.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "detalle_prestamo")
public class PrestamoHasLibro implements Serializable {
	
	@EmbeddedId
	@JsonIgnore
	private PrestamoHasLibroPK pk;
	
	//Relación MUCHOS  a UNO "Boleta"
			@ManyToOne
			@JsonBackReference
			@JoinColumn(name="cod_prestamo",insertable = false,updatable =false)
			private Prestamo prestamo;//ASOCI.
	
	//Relación MUCHOS  a UNO "Medicamento"
		@ManyToOne
		@JoinColumn(name="cod_libro",insertable = false,updatable =false)
		private Libro libro;//ASOCI.


}
