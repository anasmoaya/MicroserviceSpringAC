package org.emsi.clientService.controller;


import org.emsi.clientService.entities.Client;
import org.emsi.clientService.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
        public List<Client> getClients(){
        return  clientRepository.findAll();
        }
    @GetMapping("/clients/{id}")
    public  Client getClientById(@PathVariable("id") Long id){
        return clientRepository.findById(id).orElseThrow(()->new RuntimeException("client not found"));
    }

}
