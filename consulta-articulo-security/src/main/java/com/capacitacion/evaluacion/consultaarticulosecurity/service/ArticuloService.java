package com.capacitacion.evaluacion.consultaarticulosecurity.service;

import java.util.List;
import com.capacitacion.evaluacion.consultaarticulosecurity.model.Articulo;

public interface ArticuloService {
	
	List<Integer> getIdArticulos();
	List<Articulo> getArticulos();

}
