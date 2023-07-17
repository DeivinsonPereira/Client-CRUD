package com.deivinsonpereira.clientecrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deivinsonpereira.clientecrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
