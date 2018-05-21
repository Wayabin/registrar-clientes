package com.househack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.househack.model.Cliente;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	
}
