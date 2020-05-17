package com.unla.Grupo06OO22020.models;

import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

public class VentaModel {
	private long idVenta;
	private int nroVenta;
	private Date fecha;
	private Time hora;
	private float precioTotal;
	private VendedorModel vendedorEncargado;
	private ClienteModel cliente;
	private Set<PedidoModel> lstPedidos = new HashSet<PedidoModel>();
	
	public VentaModel() {}
	
	public VentaModel(int nroVenta, Date fecha, Time hora, float precioTotal, VendedorModel vendedorEncargado,
			ClienteModel cliente) {
		super();
		this.nroVenta = nroVenta;
		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.vendedorEncargado = vendedorEncargado;
		this.cliente = cliente;
	}

	public long getIdVenta() {
		return idVenta;
	}

	protected void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public int getNroVenta() {
		return nroVenta;
	}

	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public VendedorModel getVendedorEncargado() {
		return vendedorEncargado;
	}

	public void setVendedorEncargado(VendedorModel vendedorEncargado) {
		this.vendedorEncargado = vendedorEncargado;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public Set<PedidoModel> getLstPedidos() {
		return lstPedidos;
	}

	public void setLstPedidos(Set<PedidoModel> lstPedidos) {
		this.lstPedidos = lstPedidos;
	}

}
