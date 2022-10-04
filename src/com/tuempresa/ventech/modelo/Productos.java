package com.tuempresa.ventech.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Productos {

	@Id
	@Column(unique = true,columnDefinition = "int default 1000")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codigo;
	
	private String nombre;
	
	private BigDecimal precio;
	
	private String stock;
	
	@Depends("precio * 0.18")
	private int itbis;
	
	@ManyToOne
	private Categorias categoria;

	private String descripcion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getItbis() {
		return itbis;
	}

	public void setItbis(int itbis) {
		this.itbis = itbis;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
}
