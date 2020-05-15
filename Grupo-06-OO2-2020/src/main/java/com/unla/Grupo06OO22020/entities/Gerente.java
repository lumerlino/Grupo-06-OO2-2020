package com.unla.Grupo06OO22020.entities;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="gerente")
public class Gerente extends Empleado{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGerente;

	public Gerente() {}

	public Gerente(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada,
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
