package com.unla.Grupo06OO22020.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVenta;
	
	@Column(name = "nroVenta")
	private int nroVenta;
	
	@Column(name = "fecha")
	private LocalDate fecha;
	
	@Column(name = "hora")
	private LocalTime hora;

	@Column(name = "precioTotal")
	private float precioTotal;
	
	@OneToOne(mappedBy = "venta")
	private Vendedor vendedorEncargado;
	
	@OneToOne(mappedBy = "venta")
	private Cliente cliente;
	
	@Column(name = "lstPedidos")
	private Set<Pedido> lstPedidos = new HashSet<Pedido>();
	
	public Venta() {}
	
	public Venta(int nroVenta, LocalDate fecha, LocalTime hora, float precioTotal, Vendedor vendedorEncargado,
			Cliente cliente) {
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Vendedor getVendedorEncargado() {
		return vendedorEncargado;
	}

	public void setVendedorEncargado(Vendedor vendedorEncargado) {
		this.vendedorEncargado = vendedorEncargado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Pedido> getLstPedidos() {
		return lstPedidos;
	}

	public void setLstPedidos(Set<Pedido> lstPedidos) {
		this.lstPedidos = lstPedidos;
	}

}
