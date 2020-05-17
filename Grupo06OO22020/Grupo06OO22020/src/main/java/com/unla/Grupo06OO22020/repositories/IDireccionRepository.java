package com.unla.Grupo06OO22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo06OO22020.entities.Direccion;

@Repository("clienteRepository")
public interface IDireccionRepository extends JpaRepository<Direccion, Serializable>{

	public abstract Direccion findByIdDireccion(long idDireccion);

}
