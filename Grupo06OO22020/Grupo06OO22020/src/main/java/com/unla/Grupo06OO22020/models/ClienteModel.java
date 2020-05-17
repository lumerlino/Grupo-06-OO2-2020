package com.unla.Grupo06OO22020.models;

import java.sql.Date;

public class ClienteModel extends PersonaModel{
	private long idCliente;
	private String email;
	
	public ClienteModel() {}
	
	public ClienteModel(String apellido, String nombre, long dni, Date fechaDeNacimiento, String email) {
		super(apellido, nombre, dni, fechaDeNacimiento);
		this.email = email;
	}

	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
