package com.unla.Grupo06OO22020.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.Grupo06OO22020.converters.ClienteConverter;
import com.unla.Grupo06OO22020.entities.Cliente;
import com.unla.Grupo06OO22020.models.ClienteModel;
import com.unla.Grupo06OO22020.repositories.IClienteRepository;

public class ClienteService {
	@Autowired
	@Qualifier("clienteRepository")
	private IClienteRepository clienteRepository;
	
	@Autowired
	@Qualifier("clienteConverter")
	private ClienteConverter clienteConverter;
	
	public List<Cliente> getAll(){
		return clienteRepository.findAll();
	}
	
	public ClienteModel findByIdPersona(long idPersona) {
		return clienteConverter.entityToModel(clienteRepository.findByIdPersona(idPersona));
	}
	
	public ClienteModel insertOrUpdate(ClienteModel clienteModel) {
		Cliente cliente = clienteRepository.save(clienteConverter.modelToEntity(clienteModel));
		return clienteConverter.entityToModel(cliente);
	}
	
	public boolean remove(long idPersona) {
		try {
			clienteRepository.deleteById(idPersona);;
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}

}
