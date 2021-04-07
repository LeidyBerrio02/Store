package com.store.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.demo.model.Client;
import com.store.demo.service.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping()
	public ArrayList<Client> listClients(){
		return clientService.listClients();
	}
}
