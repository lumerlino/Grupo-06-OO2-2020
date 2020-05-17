package com.unla.Grupo06OO22020.models;

import java.util.HashSet;
import java.util.Set;

public class SucursalModel {
	private long idSucursal;
	private long telefono;
	private GerenteModel gerente;
	private Set<VendedorModel> lstVendedores = new HashSet<VendedorModel>();
	private DireccionModel direccion;
	private Set<LoteModel> lstLote = new HashSet<LoteModel>();
	
	public SucursalModel() {}
	
	public SucursalModel(long telefono, GerenteModel gerente, DireccionModel direccion) {
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

	public GerenteModel getGerente() {
		return gerente;
	}

	public void setGerente(GerenteModel gerente) {
		this.gerente = gerente;
	}

	public Set<VendedorModel> getLstVendedores() {
		return lstVendedores;
	}

	public void setLstVendedores(Set<VendedorModel> lstVendedores) {
		this.lstVendedores = lstVendedores;
	}

	public DireccionModel getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionModel direccion) {
		this.direccion = direccion;
	}

	public Set<LoteModel> getLstLote() {
		return lstLote;
	}

	public void setLstLote(Set<LoteModel> lstLote) {
		this.lstLote = lstLote;
	}

}
