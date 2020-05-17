package com.unla.Grupo06OO22020.entities;

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
@Table(name = "sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSucursal;
	
	@Column(name = "telefono")
	private long telefono;
	
	@OneToOne(mappedBy = "sucursal")
	private Gerente gerente;
	
	@Column(name = "lstVendedores")
	private Set<Vendedor> lstVendedores = new HashSet<Vendedor>();
	
	@OneToOne(mappedBy = "sucursal")
	private Direccion direccion;
	
	@Column(name = "lstLote")
	private Set<Lote> lstLote = new HashSet<Lote>();
	
	public Sucursal() {}
	
	public Sucursal(long telefono, Gerente gerente, Direccion direccion) {
		super();
		this.telefono = telefono;
		this.gerente = gerente;
		this.direccion = direccion;
	}

	public long getIdSucursal() {
		return idSucursal;
	}

	protected void setIdSucursal(long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Set<Vendedor> getLstVendedores() {
		return lstVendedores;
	}

	public void setLstVendedores(Set<Vendedor> lstVendedores) {
		this.lstVendedores = lstVendedores;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Set<Lote> getLstLote() {
		return lstLote;
	}

	public void setLstLote(Set<Lote> lstLote) {
		this.lstLote = lstLote;
	}

}
