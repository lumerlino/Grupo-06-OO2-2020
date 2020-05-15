package com.unla.Grupo06OO22020.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Sucursal;
import com.unla.Grupo06OO22020.models.SucursalModel;

@Component("sucursalConverter")
public class SucursalConverter {
	
	public	SucursalModel entityToModel(Sucursal sucursal) {
		return new SucursalModel(sucursal.getIdSucursal(), sucursal.getDireccion(), sucursal.getLatitud(), sucursal.getLongitud(), sucursal.getTelefono() );
	}
	
	public Sucursal modelToEntity(SucursalModel sucursalModel) {
		return new Sucursal(sucursalModel.getIdSucursal(), sucursalModel.getDireccion(), sucursalModel.getLatitud(), sucursalModel.getLongitud(), sucursalModel.getTelefono());
	}

}
