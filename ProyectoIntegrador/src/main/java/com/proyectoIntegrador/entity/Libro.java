package com.proyectoIntegrador.entity;

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

@Entity
@Table(name="libros")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_libro")
	private Integer codigo;
	
	@Column(name="nombre_libro")
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name="cod_editorial")
	private Editorial editorial;
	
	@Column(name="autor")
	private String autor;
	
	@ManyToOne
	@JoinColumn(name="cod_genero")
	private Genero genero;
	
	@Column(name="anio_edicion")
	private String edicion;
	
	@Column(name="stock")
	private int stock;
	
	@OneToMany(mappedBy = "libro")
	private List<PrestamoHasLibro> listaDetalle;
	
	@OneToMany(mappedBy = "libro")
	private List<DevolucionHasLibro> listaDevolucion;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
