package com.unla.Grupo06OO22020.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Empleado;
import com.unla.Grupo06OO22020.models.EmpleadoModel;

@Component("empleadoConverter")
public class EmpleadoConverter {
	
	public EmpleadoModel entityToModel(Empleado empleado) {
		return new EmpleadoModel(empleado.getIdPersona(), empleado.getNombre(), empleado.getApellido(), empleado.getFechaDeNacimiento(),
				empleado.getDni(), empleado.getHorasPorJornada(), empleado.getSueldoBasico());
	}

	public Empleado modelToEntity(EmpleadoModel empleadoModel) {
		return new Empleado(empleadoModel.getIdPersona(),empleadoModel.getNombre(), empleadoModel.getApellido(), empleadoModel.getFechaDeNacimiento(),
				empleadoModel.getDni(), empleadoModel.getHorasPorJornada(), empleadoModel.getSueldoBasico());
	}


}
