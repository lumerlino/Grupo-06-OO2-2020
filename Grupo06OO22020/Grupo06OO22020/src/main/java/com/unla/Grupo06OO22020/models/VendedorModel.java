package com.unla.Grupo06OO22020.models;

import java.sql.Date;
import java.sql.Time;

public class VendedorModel extends EmpleadoModel{
	private long idVendedor;
	private float plus;
	private SucursalModel sucursal;
	
	public VendedorModel() {}
	
	public VendedorModel(String apellido, String nombre, long dni, Date fechaDeNacimiento, Time horasPorJornada, float sueldoBasico,
			float plus, SucursalModel sucursal) {
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

	public SucursalModel getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalModel sucursal) {
		this.sucursal = sucursal;
	}

}
