package com.unla.Grupo06OO22020.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Sucursal;
import com.unla.Grupo06OO22020.models.SucursalModel;
import com.unla.Grupo06OO22020.converters.DireccionConverter;

@Component("sucursalConverter")
public class SucursalConverter {
	
	@Autowired
	@Qualifier("direccionConverter")
	private DireccionConverter direccionConverter;
	
	@Autowired
	@Qualifier("gerenteConverter")
	private GerenteConverter gerenteConverter;
	
	public	SucursalModel entityToModel(Sucursal sucursal) {
		return new SucursalModel(sucursal.getTelefono(), gerenteConverter.entityToModel(sucursal.getGerente()),
				direccionConverter.entityToModel(sucursal.getDireccion()));
	}
	
	public Sucursal modelToEntity(SucursalModel sucursalModel) {
		return new Sucursal(sucursalModel.getTelefono(), gerenteConverter.modelToEntity(sucursalModel.getGerente()),
				direccionConverter.modelToEntity(sucursalModel.getDireccion()));
	}

}
