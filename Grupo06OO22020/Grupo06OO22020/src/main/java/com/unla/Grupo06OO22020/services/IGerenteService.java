package com.unla.Grupo06OO22020.services;

import java.util.List;

import com.unla.Grupo06OO22020.entities.Gerente;
import com.unla.Grupo06OO22020.models.GerenteModel;

public interface IGerenteService {
	
	public List<Gerente> getAll();
	
	public GerenteModel insertOrUpdate(GerenteModel gerenteModel);
	
	public GerenteModel findByIdPersona(long idPersona);
	
	public boolean remove(long idPersona);

}
