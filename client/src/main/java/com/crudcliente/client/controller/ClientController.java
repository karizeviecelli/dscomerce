package com.crudcliente.client.controller;

import com.crudcliente.client.model.Client;
import com.crudcliente.client.service.ClientService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService service;
    public ClientController(ClientService service) { this.service = service; }

    @GetMapping
    public List<Client> list() {
        return service.findAll();
    }
}

