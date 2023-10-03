package com.proyectoIntegrador.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyectoIntegrador.entity.LibrosPorSede;

public interface LibrosPorSedeRepository extends JpaRepository<LibrosPorSede, Integer>{
	
	@Query("select e, stock from LibrosPorSede lhs join lhs.libroSede e where lhs.sedeLibro.codigo=?1")
	public List<Object> listaLibrosPorSede (int codigo);

}
