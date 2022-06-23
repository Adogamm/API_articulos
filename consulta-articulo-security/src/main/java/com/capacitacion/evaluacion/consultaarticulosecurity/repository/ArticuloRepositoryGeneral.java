package com.capacitacion.evaluacion.consultaarticulosecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capacitacion.evaluacion.consultaarticulosecurity.model.Articulo;
/**
 * 
 * @author emma.romero
 * @return 
 *
 */
@Repository
public interface ArticuloRepositoryGeneral extends JpaRepository<Articulo, Long>{
	
	@Query(value="select id from articulos_ropa_detalles u", nativeQuery = true)
	List<Integer>  getAllIdOptional();

}
