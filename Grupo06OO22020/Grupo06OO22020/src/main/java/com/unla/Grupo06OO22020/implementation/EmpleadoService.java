package com.unla.Grupo06OO22020.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo06OO22020.services.IEmpleadoService;
import com.unla.Grupo06OO22020.converters.EmpleadoConverter;
import com.unla.Grupo06OO22020.entities.Empleado;
import com.unla.Grupo06OO22020.models.EmpleadoModel;
import com.unla.Grupo06OO22020.repositories.IEmpleadoRepository;

@Service("empleadoService")
public class EmpleadoService implements IEmpleadoService{
	@Autowired
	@Qualifier("empleadoRepository")
	private IEmpleadoRepository empleadoRepository;

	@Autowired
	@Qualifier("empleadoConverter")
	private EmpleadoConverter empleadoConverter;
	
	public List<Empleado> getAll() {
		return empleadoRepository.findAll();
	}

	public EmpleadoModel findByIdPersona(long idPersona) {
		return empleadoConverter.entityToModel(empleadoRepository.findByIdPersona(idPersona));
	}

	public EmpleadoModel findByNombre(String nombre) {
		return empleadoConverter.entityToModel(empleadoRepository.findByNombre(nombre));
	}

	public EmpleadoModel insertOrUpdate(EmpleadoModel empleadoModel) {
		Empleado empleado = empleadoRepository.save(empleadoConverter.modelToEntity(empleadoModel));
		return empleadoConverter.entityToModel(empleado);
	}

	public boolean remove(long idPersona) {
		try {
			empleadoRepository.deleteById(idPersona);
			return true;
		}catch(Exception e){
			return false;
		}
	}


}
