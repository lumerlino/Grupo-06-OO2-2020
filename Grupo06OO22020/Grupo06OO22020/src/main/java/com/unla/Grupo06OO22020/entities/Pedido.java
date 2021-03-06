package com.unla.Grupo06OO22020.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPedido;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "aceptado")
	private boolean aceptado;
	
	@OneToOne(mappedBy = "pedido")
	private Producto producto;

	@OneToOne(mappedBy = "vendedor")
	private Vendedor vendedorAuxiliar;		
	
	public Pedido() {}
	
	public Pedido(int cantidad, boolean aceptado, Producto producto, Vendedor vendedorAuxiliar) {
		super();
		this.cantidad = cantidad;
		this.aceptado = aceptado;
		this.producto = producto;
		this.vendedorAuxiliar = vendedorAuxiliar;
	}

	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Vendedor getVendedorAuxiliar() {
		return vendedorAuxiliar;
	}

	public void setVendedorAuxiliar(Vendedor vendedorAuxiliar) {
		this.vendedorAuxiliar = vendedorAuxiliar;
	}

}
