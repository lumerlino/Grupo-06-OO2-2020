package com.unla.Grupo06OO22020.models;

import java.time.LocalDate;

public class ClienteModel extends PersonaModel{

	private long idCliente;
	private String email;
	
	public ClienteModel() {}

	public ClienteModel(String apellido, String nombre,  long dni, LocalDate fechaDeNacimiento, String email) {
		super(nombre, apellido, fechaDeNacimiento, dni);
		this.email = email;
	}
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
