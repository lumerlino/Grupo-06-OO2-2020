package com.unla.Grupo06OO22020.models;

import com.unla.Grupo06OO22020.entities.Sucursal;

public class DireccionModel {
	
	private long idDireccion;
	private String ciudad;
	private String calle;
	private int numero;
	private float latitud;
	private float longitud;
	private Sucursal sucursal;
	
	public DireccionModel() {}
	
	public DireccionModel(String ciudad, String calle, int numero, float latitud, float longitud, Sucursal sucursal) {
		super();
		this.ciudad = ciudad;
		this.calle = calle;
		this.numero = numero;
		this.latitud = latitud;
		this.longitud = longitud;
		this.sucursal = sucursal;
	}

	public long getIdDireccion() {
		return idDireccion;
	}

	protected void setIdDireccion(long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}


}
