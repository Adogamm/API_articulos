package com.capacitacion.evaluacion.consultaarticulosecurity.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capacitacion.evaluacion.consultaarticulosecurity.model.Articulo;
import com.capacitacion.evaluacion.consultaarticulosecurity.repository.ArticuloRepositoryGeneral;

@Service
@Transactional
public class ArticuloServiceImpl implements ArticuloService{
	
	@Autowired
	private ArticuloRepositoryGeneral articuloRepositoryGeneral;

	@Override
	public List<Integer> getIdArticulos() {
		// TODO Auto-generated method stub
		return this.articuloRepositoryGeneral.getAllIdOptional();
	}

	@Override
	public List<Articulo> getArticulos() {
		// TODO Auto-generated method stub
		return this.articuloRepositoryGeneral.findAll();
	}

}
