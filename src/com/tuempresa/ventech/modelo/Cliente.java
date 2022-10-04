package com.tuempresa.ventech.modelo;

import javax.persistence.*;

@Entity
public class Cliente {

	@Id
	@Column(unique = true,columnDefinition = "int default 0")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numeroCLiente;
	
}
