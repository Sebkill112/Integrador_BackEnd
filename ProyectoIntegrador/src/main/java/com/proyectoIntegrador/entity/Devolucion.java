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
public class Devolucion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_devolucion")
	private int codigo;
	@Column(name = "num_prestamo")
	private String num_devolucion;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_devolucion")
	private Date fechaDevolucion;

	@ManyToOne
	@JoinColumn(name = "cod_usuario")
	private Usuario usuario;

	// Relación UNO a MUCHOS "ConceptoHasBoleta"
	@OneToMany(mappedBy = "devolucion")
	private List<DevolucionHasLibro> listaDevolucionHasLibro;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNum_devolucion() {
		return num_devolucion;
	}

	public void setNum_devolucion(String num_devolucion) {
		this.num_devolucion = num_devolucion;
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

	public List<DevolucionHasLibro> getListaDevolucionHasLibro() {
		return listaDevolucionHasLibro;
	}

	public void setListaDevolucionHasLibro(List<DevolucionHasLibro> listaDevolucionHasLibro) {
		this.listaDevolucionHasLibro = listaDevolucionHasLibro;
	}

}
