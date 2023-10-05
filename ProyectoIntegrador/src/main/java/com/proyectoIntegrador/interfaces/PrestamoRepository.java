package com.proyectoIntegrador.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.proyectoIntegrador.entity.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Integer> {
	
	@Modifying
	@Query(value ="update prestamo set estado =:estado WHERE num_prestamo =:num",nativeQuery = true)
	public void actualizaEstado(String estado,String num);

}
