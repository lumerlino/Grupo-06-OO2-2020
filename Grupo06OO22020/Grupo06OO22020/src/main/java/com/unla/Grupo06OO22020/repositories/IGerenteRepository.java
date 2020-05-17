package com.unla.Grupo06OO22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unla.Grupo06OO22020.entities.Gerente;

public interface IGerenteRepository extends JpaRepository<Gerente, Serializable>{
	
	public abstract Gerente findByEmail(String email);

	public abstract Gerente findByIdPersona(long idPersona);
	

}
