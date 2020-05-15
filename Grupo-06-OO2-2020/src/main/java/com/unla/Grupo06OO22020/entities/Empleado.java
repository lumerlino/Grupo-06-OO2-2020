package com.unla.Grupo06OO22020.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.unla.Grupo06OO22020.entities.Persona;

@Entity
@Table(name="empleado")
public class Empleado extends Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmpleado;
	
	@Column(name = "horasPorJornada")
	private LocalTime horasPorJornada;
	
	@Column(name = "sueldoBasico")
	private float sueldoBasico;
	
	public Empleado() {}
	
	public Empleado(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada, float sueldoBasico) {
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
	

	