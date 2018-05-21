package com.househack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.househack.model.Cliente;
import com.househack.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public Cliente registraCliente(String nombre) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		
		clienteRepository.save(cliente);
		
		return cliente;
		
	}
	
	
	
	
	

}
