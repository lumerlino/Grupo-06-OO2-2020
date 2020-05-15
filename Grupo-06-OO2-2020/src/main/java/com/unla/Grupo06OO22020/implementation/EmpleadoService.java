package com.unla.Grupo06OO22020.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo06OO22020.converters.EmpleadoConverter;
import com.unla.Grupo06OO22020.entities.Empleado;
import com.unla.Grupo06OO22020.models.EmpleadoModel;
import com.unla.Grupo06OO22020.repositories.IEmpleadoRepository;

@Service("empleadoService")
public class EmpleadoService {
	
	@Autowired
	@Qualifier("empleadoRepository")
	private IEmpleadoRepository empleadoRepository;

	@Autowired
	@Qualifier("empleadoConverter")
	private EmpleadoConverter empleadoConverter;
	
	@Override
	public List<Empleado> getAll() {
		return empleadoRepository.findAll();
	}

	@Override
	public EmpleadoModel findByIdPersona(long idPersona) {
		return empleadoConverter.entityToModel(empleadoRepository.findByIdPersona(idPersona));
	}

	@Override
	public EmpleadoModel findByNombre(String nombre) {
		return empleadoConverter.entityToModel(empleadoRepository.findByNombre(nombre));
	}

	@Override
	public EmpleadoModel insertOrUpdate(EmpleadoModel empleadoModel) {
		Empleado empleado = empleadoRepository.save(empleadoConverter.modelToEntity(empleadoModel));
		return empleadoConverter.entityToModel(empleado);
	}

	@Override
	public boolean remove(long idPersona) {
		try {
			empleadoRepository.deleteById(idPersona);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	

}
