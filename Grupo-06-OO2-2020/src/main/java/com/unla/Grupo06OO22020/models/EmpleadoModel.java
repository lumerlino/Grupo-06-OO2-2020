package com.unla.Grupo06OO22020.models;

import java.time.LocalDate;
import java.time.LocalTime;



public class EmpleadoModel extends PersonaModel{

	private long idEmpleado;
	private LocalTime horasPorJornada;
	private float sueldoBasico;
	
	public EmpleadoModel() {}
	
	public EmpleadoModel(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada, float sueldoBasico) {
		super(apellido, nombre, fechaDeNacimiento, dni);
		this.horasPorJornada = horasPorJornada;
		this.sueldoBasico = sueldoBasico;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	protected void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public LocalTime getHorasPorJornada() {
		return horasPorJornada;
	}

	public void setHorasPorJornada(LocalTime horasPorJornada) {
		this.horasPorJornada = horasPorJornada;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
}
