package com.unla.Grupo06OO22020.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.unla.Grupo06OO22020.entities.Sucursal;


@Entity
@Table(name = "cliente")
public class Cliente extends Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCliente;
	
	@Column(name = "email")
	private String email;
	
	public Cliente() {}

	public Cliente(String nombre, String apellido, LocalDate fechaDeNacimiento, long dni, String email) {
		super(nombre, apellido,  dni, fechaDeNacimiento);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
