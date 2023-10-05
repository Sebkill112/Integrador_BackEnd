package com.proyectoIntegrador.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.proyectoIntegrador.entity.Enlace;
import com.proyectoIntegrador.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
	
	@Modifying
	@Query(value ="update prestamo set estado =:estado WHERE num_prestamo =:num",nativeQuery = true)
	public void actualizaEstado(String estado,String num);
	
	@Query("select p from Prestamo p  where p.estado=?1")
	public List<Prestamo>listarPorEstado(String est);

}
