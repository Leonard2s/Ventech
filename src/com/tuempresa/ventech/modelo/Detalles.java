package com.tuempresa.ventech.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity @Embeddable
public class Detalles extends Identifiable {

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	private Productos producto;
    
	private	int cantidad;
	
	@Money
	@Depends("producto.numero, cantidad") // Cuando usuario cambie producto o cantidad
	public BigDecimal getImporte() { // esta propiedad se recalculará y se redibujará
	        if (producto == null || producto.getPrecio() == null) return BigDecimal.ZERO;
	        return new BigDecimal(cantidad).multiply(producto.getPrecio());
	 }
    
	public Productos getProducto() {
		return producto;
	}
	public void setProductos(Productos producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
