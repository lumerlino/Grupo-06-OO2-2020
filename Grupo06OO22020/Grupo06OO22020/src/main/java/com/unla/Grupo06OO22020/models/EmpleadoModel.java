package com.unla.Grupo06OO22020.models;

import java.sql.Date;
import java.sql.Time;

public class EmpleadoModel extends PersonaModel{
	private long idEmpleado;
	private Time horasPorJornada;
	private float sueldoBasico;
	
	public EmpleadoModel() {}
	
	public EmpleadoModel(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada, float sueldoBasico) {
		super(apellido, nombre, dni, fechaDeNacimiento);
		this.horasPorJornada = horasPorJornada;
		this.sueldoBasico = sueldoBasico;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	protected void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Time getHorasPorJornada() {
		return horasPorJornada;
	}

	public void setHorasPorJornada(Time horasPorJornada) {
		this.horasPorJornada = horasPorJornada;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

}
