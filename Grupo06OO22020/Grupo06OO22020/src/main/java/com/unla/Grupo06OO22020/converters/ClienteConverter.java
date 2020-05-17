package com.unla.Grupo06OO22020.converters;

import org.springframework.stereotype.Component;

import com.unla.Grupo06OO22020.entities.Cliente;
import com.unla.Grupo06OO22020.models.ClienteModel;

@Component("clienteConverter")
public class ClienteConverter {
	public ClienteModel entityToModel(Cliente cliente) {
		return new ClienteModel( cliente.getApellido(), cliente.getNombre(), cliente.getDni(), cliente.getFechaDeNacimiento(), cliente.getEmail());
	}
	
	public Cliente modelToEntity(ClienteModel clienteModel) {
		return new Cliente(clienteModel.getApellido(), clienteModel.getNombre(), clienteModel.getDni(), clienteModel.getFechaDeNacimiento(), clienteModel.getEmail());
	}

}
