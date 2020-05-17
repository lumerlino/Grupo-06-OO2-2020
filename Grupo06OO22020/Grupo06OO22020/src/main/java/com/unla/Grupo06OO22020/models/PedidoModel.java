package com.unla.Grupo06OO22020.models;

public class PedidoModel {
	private long idPedido;
	private int cantidad;
	private boolean aceptado;
	private ProductoModel producto;
	private VendedorModel vendedorAuxiliar;
	
	public PedidoModel() {}
	
	public PedidoModel(int cantidad, boolean aceptado, ProductoModel producto, VendedorModel vendedorAuxiliar) {
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

	public ProductoModel getProducto() {
		return producto;
	}

	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}

	public VendedorModel getVendedorAuxiliar() {
		return vendedorAuxiliar;
	}

	public void setVendedorAuxiliar(VendedorModel vendedorAuxiliar) {
		this.vendedorAuxiliar = vendedorAuxiliar;
	}

}
