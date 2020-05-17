package com.unla.Grupo06OO22020.models;

import java.sql.Date;

public class LoteModel {
	private long idLote;
	private int cantidad;
	private int cantidadTotal;
	private Date fechaIngreso;
	private ProductoModel producto;
	
	public LoteModel() {}
	
	public LoteModel(int cantidad, int cantidadTotal, Date fechaIngreso, ProductoModel producto) {
		super();
		this.cantidad = cantidad;
		this.cantidadTotal = cantidadTotal;
		this.fechaIngreso = fechaIngreso;
		this.producto = producto;
	}

	public long getIdLote() {
		return idLote;
	}

	protected void setIdLote(long idLote) {
		this.idLote = idLote;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

}
