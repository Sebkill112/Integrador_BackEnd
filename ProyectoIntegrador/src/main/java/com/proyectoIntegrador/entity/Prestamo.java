package com.proyectoIntegrador.entity;

import java.util.Date;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prestamo")

public class Prestamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_prestamo")
	private int codigo;
	@Column(name = "num_prestamo")
	private String num_prestamo;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_salida")
	private Date fechaSalida;
	@Column(name = "fecha_devolucion")
	private Date fechaDevolucion;

	// Relación MUCHOS a UNO "Usuario"
	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;
	
	//Relación UNO a MUCHOS "ConceptoHasBoleta"
		@OneToMany(mappedBy = "prestamo")
		private List<PrestamoHasLibro> listaPrestamoHasLibro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNum_prestamo() {
		return num_prestamo;
	}

	public void setNum_prestamo(String num_prestamo) {
		this.num_prestamo = num_prestamo;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
