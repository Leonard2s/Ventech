package com.tuempresa.ventech.modelo;
import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Categorias extends Identifiable {

	private String nombre;
	
	private String descripcion;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
