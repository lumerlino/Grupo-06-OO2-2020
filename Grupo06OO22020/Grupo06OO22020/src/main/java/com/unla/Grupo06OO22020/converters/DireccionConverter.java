package com.unla.Grupo06OO22020.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Direccion;
import com.unla.Grupo06OO22020.models.DireccionModel;

@Component("direccionConverter")
public class DireccionConverter {
	
	@Autowired
	@Qualifier("sucursalConverter")
	private SucursalConverter sucursalConverter;
	
	public DireccionModel entityToModel(Direccion direccion) {
		return new DireccionModel( direccion.getCiudad(), direccion.getCalle(), direccion.getNumero(),direccion.getLatitud(), direccion.getLongitud(),
				sucursalConverter.entityToModel(direccion.getSucursal()));
	}
	
	public Direccion modelToEntity(DireccionModel direccionModel) {
		return new Direccion(direccionModel.getCiudad(), direccionModel.getCalle(), direccionModel.getNumero(), direccionModel.getLatitud(), direccionModel.getLongitud(),
				sucursalConverter.modelToEntity(direccionModel.getSucursal()));
	}

}
