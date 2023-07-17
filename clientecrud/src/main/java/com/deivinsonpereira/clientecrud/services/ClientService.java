package com.deivinsonpereira.clientecrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deivinsonpereira.clientecrud.dto.ClientDTO;
import com.deivinsonpereira.clientecrud.entities.Client;
import com.deivinsonpereira.clientecrud.repositories.ClientRepository;
import com.deivinsonpereira.clientecrud.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		try {
			Page<Client> list = clientRepository.findAll(pageRequest);
			return list.map(x -> new ClientDTO(x));
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Not found");
		}
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Client result = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Not found"));
		return new ClientDTO(result);
	}

	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		try {
			Client entity = new Client();
			copyDtoToEntity(dto, entity);
			entity = clientRepository.save(entity);
			return new ClientDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Not Found");
		}
	}

	@Transactional
	public ClientDTO update(Long id, ClientDTO dto) {
		try {
			Client entity = clientRepository.getReferenceById(id);
			copyDtoToEntity(dto, entity);
			entity = clientRepository.save(entity);
			return new ClientDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Not Found");
		}
	}

	private void copyDtoToEntity(ClientDTO dto, Client entity) {
		try {
			entity.setName(dto.getName());
			entity.setCpf(dto.getCpf());
			entity.setIncome(dto.getIncome());
			entity.setBirthDate(dto.getBirthDate());
			entity.setChildren(dto.getChildren());
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Not found");
		}
	}

}
