package com.crudcliente.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudcliente.client.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
