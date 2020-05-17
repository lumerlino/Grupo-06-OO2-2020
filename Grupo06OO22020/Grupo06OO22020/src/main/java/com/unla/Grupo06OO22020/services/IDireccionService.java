package com.unla.Grupo06OO22020.services;

import java.util.List;

import com.unla.Grupo06OO22020.entities.Direccion;
import com.unla.Grupo06OO22020.models.DireccionModel;

public interface IDireccionService {
	
	public List<Direccion> getAll();
	
	public DireccionModel insertOrUpdate(DireccionModel direccionModel);
	
	public DireccionModel findByIdDireccion(long idDireccion);
	
	public boolean remove(long idDireccion);

}
