package com.capacitacion.evaluacion.consultaarticulosecurity.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.capacitacion.evaluacion.consultaarticulosecurity.enums.CategoriaEnum;


/**
 * Clase para el objeto articulo
 * @author emma.romero
 *
 */

@Entity
@Table(name = "articulos")
public class Articulo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Enumerated(EnumType.STRING)
	private CategoriaEnum categoria;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private BigDecimal precio;
	
	@Column(name = "stock")
	private int stock;

	@Column(name = "stockminimo")
	private int stockMinimo;
	
	@Column(name = "stockmaximo")
	private int stockMaximo;
	
	@Column(name = "costo")
	private double costo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
