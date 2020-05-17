package com.unla.Grupo06OO22020.models;

import java.sql.Date;

public class ProductoModel {
	private long idProducto;
	private boolean estado;
	private String descripcion;
	private float precioUnitario;
	private Date fechaAlta;
	private String marca;
	
	public ProductoModel() {}
	
	public ProductoModel(boolean estado, String descripcion, float precioUnitario, Date fechaAlta, String marca) {
		super();
		this.estado = estado;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.fechaAlta = fechaAlta;
		this.marca = marca;
	}

	public long getIdProducto() {
		return idProducto;
	}
	protected void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
