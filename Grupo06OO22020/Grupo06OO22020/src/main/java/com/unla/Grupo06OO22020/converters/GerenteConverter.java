package com.unla.Grupo06OO22020.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Gerente;
import com.unla.Grupo06OO22020.models.GerenteModel;

@Component("gerenteConverter")
public class GerenteConverter {
	
	@Autowired
	@Qualifier("sucursalConverter")
	private SucursalConverter sucursalConverter;
	
	public GerenteModel entityToModel(Gerente gerente) {
		return new GerenteModel(gerente.getApellido(), gerente.getNombre(), gerente.getDni(),gerente.getFechaDeNacimiento(),
				gerente.getHorasPorJornada(), gerente.getSueldoBasico(), sucursalConverter.entityToModel(gerente.getSucursal()));
	}
	
	public Gerente modelToEntity(GerenteModel gerenteModel) {
		return new Gerente(gerenteModel.getApellido(), gerenteModel.getNombre(), gerenteModel.getDni(), gerenteModel.getFechaDeNacimiento(),
				gerenteModel.getHorasPorJornada(), gerenteModel.getSueldoBasico(), sucursalConverter.modelToEntity(gerenteModel.getSucursal()));
	}

}
