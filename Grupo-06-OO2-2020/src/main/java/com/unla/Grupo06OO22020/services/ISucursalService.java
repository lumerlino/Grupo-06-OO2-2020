package com.unla.Grupo06OO22020.services;

import java.util.List;

import com.unla.Grupo06OO22020.entities.Sucursal;
import com.unla.Grupo06OO22020.models.SucursalModel;

public class ISucursalService {
	
public List<Sucursal> getAll();
	
	public SucursalModel insertOrUpdate(SucursalModel sucursalModel);
	
	public SucursalModel findByIdLocal(long idSucursal);
	
	public boolean remove(long idSucursal);

}
