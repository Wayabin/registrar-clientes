package com.househack.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.househack.model.Cliente;
import com.househack.repository.ClienteRepository;
import com.househack.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteApiController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	ClienteService clienteService;

	
	@GetMapping
	public Cliente registraCliente(@RequestParam String nombre) {
		return clienteService.registraCliente(nombre);
		
		
	}
	
	@GetMapping("/findAll")
	public Iterable<Cliente> verClientes(){
		
		return clienteRepository.findAll();
		
	}
}
