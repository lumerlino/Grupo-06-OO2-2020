package com.unla.Grupo06OO22020.models;

import java.sql.Date;
import java.sql.Time;

public class GerenteModel extends EmpleadoModel{
	private long idGerente;
	private SucursalModel sucursal;

	public GerenteModel() {}

	public GerenteModel(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada,
			float sueldoBasico, SucursalModel sucursal) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
		this.sucursal = sucursal;
	}

	public long getIdGerente() {
		return idGerente;
	}

	protected void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
	}
	
	public SucursalModel getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalModel sucursal) {
		this.sucursal = sucursal;
	}

}
