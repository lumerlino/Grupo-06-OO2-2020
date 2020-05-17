package com.unla.Grupo06OO22020.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProducto;
	
	@Column(name = "estado")
	private boolean estado;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precioUnitario")
	private float precioUnitario;
	
	@Column(name = "fechaAlta")
	private LocalDate fechaAlta;
	
	@Column(name = "marca")
	private String marca;
	
	public Producto() {}
	
	public Producto(boolean estado, String descripcion, float precioUnitario, LocalDate fechaAlta, String marca) {
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
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
