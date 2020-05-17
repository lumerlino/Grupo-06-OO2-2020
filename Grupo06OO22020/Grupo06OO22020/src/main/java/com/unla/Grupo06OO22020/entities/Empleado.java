package com.unla.Grupo06OO22020.entities;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado extends Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpleado;
	
	@Column(name = "horasPorJornada")
	private Time horasPorJornada;
	
	@Column(name = "sueldoBasico")
	private float sueldoBasico;
	
	public Empleado() {}
	
	public Empleado(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada, float sueldoBasico) {
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
