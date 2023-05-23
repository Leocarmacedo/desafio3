package com.carnacorp.desafio3.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carnacorp.desafio3.dto.ClientDTO;
import com.carnacorp.desafio3.entities.Client;
import com.carnacorp.desafio3.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> result = repository.findById(id);
		Client client = result.get();
		return new ClientDTO(client);
	}

}
