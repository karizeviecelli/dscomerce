package com.crudcliente.client.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crudcliente.client.model.Client;
import com.crudcliente.client.repository.ClientRepository;

@Service
public class ClientService {
    private  ClientRepository repo;

 
    public ClientService(ClientRepository clientRepository) {
        this.repo = clientRepository;
    }

    public ClientService() {
    }

    public List<Client> findAll() {
        return repo.findAll();
    }

    // seu método atual de debug:
    public void listClients() {
        repo.findAll().forEach(System.out::println);
    }

    
}
