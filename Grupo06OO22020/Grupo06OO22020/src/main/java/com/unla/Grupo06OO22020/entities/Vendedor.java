package com.unla.Grupo06OO22020.entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor extends Empleado{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVendedor;
	
	@Column(name = "plus")
	private float plus;
	
	@OneToOne(mappedBy = "vendedor")
	private Sucursal sucursal;
	
	public Vendedor() {}
	
	public Vendedor(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada, float sueldoBasico,
			float plus, Sucursal sucursal) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
		this.plus = plus;
		this.sucursal = sucursal;
		
	}

	public long getIdVendedor() {
		return idVendedor;
	}

	protected void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}

	public float getPlus() {
		return plus;
	}

	public void setPlus(float plus) {
		this.plus = plus;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}
