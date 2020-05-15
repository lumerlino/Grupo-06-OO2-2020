package com.unla.Grupo06OO22020.models;

import java.time.LocalDate;
import java.time.LocalTime;


public class GerenteModel extends EmpleadoModel{
	
	private long idGerente;

	public GerenteModel() {}

	public GerenteModel(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada,
			float sueldoBasico) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
	}

	public long getIdGerente() {
		return idGerente;
	}

	protected void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
	}


}
