package com.tuempresa.ventech.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Facturas {

	@Id
	@Column(unique = true,columnDefinition = "int default 1000")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numero;
	
	private Cliente cliente;
	
	private LocalDate fecha;
	
	@ElementCollection
	@ListProperties("codigo,cantidad,precio")
	private Collection<Detalles> detalles;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Collection<Detalles> getDetalles() {
		return detalles;
	}

	public void setDetalles(Collection<Detalles> detalles) {
		this.detalles = detalles;
	}
}
