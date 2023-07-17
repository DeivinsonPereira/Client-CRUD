package com.deivinsonpereira.clientecrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.deivinsonpereira.clientecrud.dto.ClientDTO;
import com.deivinsonpereira.clientecrud.entities.Client;
import com.deivinsonpereira.clientecrud.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> result = clientRepository.findAll(pageRequest);
		return result.map(x -> new ClientDTO(x));
	}
	
}
