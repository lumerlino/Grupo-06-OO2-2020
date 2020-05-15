package com.unla.Grupo06OO22020.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.Grupo06OO22020.converters.SucursalConverter;
import com.unla.Grupo06OO22020.entities.Sucursal;
import com.unla.Grupo06OO22020.models.SucursalModel;
import com.unla.Grupo06OO22020.repositories.ISucursalRepository;

@Service("sucursalService")
public class SucursalService {
	
	@Autowired
	@Qualifier("sucursalRepository")
	private ISucursalRepository sucursalRepository;
	
	@Autowired
	@Qualifier("sucursalConverter")
	private SucursalConverter sucursalConverter;
	
	@Override
	public List<Sucursal> getAll(){
		return sucursalRepository.findAll();
	}
	@Override
	public SucursalModel findByIdSucursal(long idSucursal) {	
		return sucursalConverter.entityToModel(sucursalRepository.findByIdSucursal(idSucursal));
	}

	@Override
	public SucursalModel insertOrUpdate(SucursalModel sucursalModel) {
		Sucursal sucursal = sucursalRepository.save(sucursalConverter.modelToEntity(sucursalModel));
		return sucursalConverter.entityToModel(sucursal);
	}

	@Override
	public boolean remove(long idSucursal) {
		try {
			sucursalRepository.deleteById(idSucursal);;
			return true;
		}catch(Exception e) {return false;}
		
	}

}
