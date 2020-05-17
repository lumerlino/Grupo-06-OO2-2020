package com.unla.Grupo06OO22020.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Empleado;
import com.unla.Grupo06OO22020.models.EmpleadoModel;

@Component("empleadoConverter")
public class EmpleadoConverter {	
	
	public EmpleadoModel entityToModel(Empleado empleado) {
		return new EmpleadoModel(empleado.getApellido(), empleado.getNombre(),  empleado.getDni(), empleado.getFechaDeNacimiento(),
				 empleado.getHorasPorJornada(), empleado.getSueldoBasico());
	}

	public Empleado modelToEntity(EmpleadoModel empleadoModel) {
		return new Empleado( empleadoModel.getApellido(),empleadoModel.getNombre(),empleadoModel.getDni(), empleadoModel.getFechaDeNacimiento(),
				 empleadoModel.getHorasPorJornada(), empleadoModel.getSueldoBasico());
	}

}
