package com.unla.Grupo06OO22020.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.Grupo06OO22020.entities.Empleado;

@Repository("empleadoRepository")
public interface IEmpleadoRepository extends JpaRepository<Empleado, Serializable>{
	
	public abstract Empleado findByIdPersona(long idPersona);
	
	public abstract Empleado findByNombre(String nombre);

}
