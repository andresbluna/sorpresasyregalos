package com.sorpresas.userapi.controller;

import com.sorpresas.userapi.models.ClientModel;
import com.sorpresas.userapi.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientModel client) {
        ClientModel createdClient = clientService.createClient(client);
        return new ResponseEntity<>(createdClient, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getAllClients() {
        List<ClientModel> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    @GetMapping("/{clientId}")
    public ResponseEntity<ClientModel> getClientById(@PathVariable Long clientId) {
        boolean client = ClientService.getClientById(clientId);
        if (client) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{clientId}")
    public ResponseEntity<ClientModel> updateClient(@PathVariable Long clientId,
                                                    @RequestBody ClientModel updatedClient) {
        ClientModel client = clientService.updateClient(clientId, updatedClient);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long clientId) {
        ClientModel client = clientService.deleteClient(clientId);
        if (client != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
