package com.capacitacion.evaluacion.consultaarticulosecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capacitacion.evaluacion.consultaarticulosecurity.error.Mensaje;
import com.capacitacion.evaluacion.consultaarticulosecurity.model.Articulo;
import com.capacitacion.evaluacion.consultaarticulosecurity.service.ArticuloService;

/**
 * Clase controller de articulo
 * @author emma.romero
 *
 */
@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping("/all/Id")
	public ResponseEntity<?> getAllIDArticulos(){
		List<Integer> lista = articuloService.getIdArticulos();
		if(lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin usuario en la base de datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(articuloService.getIdArticulos());
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllArticulos(){
		List<Articulo> lista = articuloService.getArticulos();
		if(lista.isEmpty()) {
			return new ResponseEntity<>(new Mensaje("Sin usuario en la base de datos"), HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(articuloService.getArticulos());
	}
}
