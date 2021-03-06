package com.store.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Client> listClients(){
		return clientService.listClients();
	}
	
	@PostMapping("/create")
	public Boolean createClient(@RequestBody Client client) {
		return clientService.createClient(client);
	}
	
	@PutMapping("/updateClient")
	public Boolean addProductNew(@RequestBody Client client) {
		return clientService.updateClient(client);
	}
	
	@GetMapping("/delete")
	public void delete() {
		clientService.changeStatus();
	}
	
	/*@GetMapping("/addProductInlist")
	public void addProductExisted() {
		orderService.addProductAtDetail(Data.product3, 2);
	}
	
	@PutMapping("/addProductNew")
	public void addProductNew(@RequestBody Product product) {
		orderService.addProductAtDetail(product, 4);
	}*/
}
