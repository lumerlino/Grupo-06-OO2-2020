package com.unla.Grupo06OO22020.services;

import java.util.List;

import com.unla.Grupo06OO22020.entities.Cliente;
import com.unla.Grupo06OO22020.models.ClienteModel;

public class IClienteService {
	
public List<Cliente> getAll();
	
	public ClienteModel insertOrUpdate(ClienteModel clienteModelo);
	
	public ClienteModel findByIdPersona(long idPersona);
	
	public boolean remove(long idPersona);

}
