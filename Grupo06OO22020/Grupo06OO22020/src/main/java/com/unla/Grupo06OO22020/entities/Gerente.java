package com.unla.Grupo06OO22020.entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gerente")
public class Gerente extends Empleado{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGerente;
	
	@OneToOne(mappedBy = "gerente")
	private Sucursal sucursal;

	public Gerente() {}

	public Gerente(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada,
			float sueldoBasico, Sucursal sucursal) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
		this.sucursal = sucursal;
	}

	public long getIdGerente() {
		return idGerente;
	}

	protected void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
	}
	
	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}
