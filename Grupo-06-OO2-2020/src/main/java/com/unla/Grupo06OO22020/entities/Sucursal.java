package com.unla.Grupo06OO22020.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.unla.Grupo06OO22020.entities.Cliente;
import com.unla.Grupo06OO22020.entities.Empleado;

@Entity
@Table(name="sucursal")
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSucursal;
	
	@Column(name = "telefono")
	private long telefono;
	
	@OneToOne(mappedBy = "gerente")
    private Gerente gerente;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sucursal")
	private Set<Empleado> lstEmpleados = new HashSet<Empleado>();
	
	@OneToOne(mappedBy = "direccion")
    private Direccion direccion;
	

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

	public Set<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	public void setLstEmpleados(Empleado lstEmpleados) {
		this.lstEmpleados = (Set<Empleado>) lstEmpleados;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	


}