package com.unla.Grupo06OO22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo06OO22020.entities.Sucursal;

@Repository("sucursalRepository")
public interface ISucursalRepository extends JpaRepository<Sucursal, Serializable>{
	
	public abstract Sucursal findByIdSucursal(long idSucursal);

}
