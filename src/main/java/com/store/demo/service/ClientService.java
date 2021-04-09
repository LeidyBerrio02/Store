package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Client;

public interface ClientService {

	ArrayList<Client> listClients();
	void updateClient(Client client);
	Boolean update(Client client, Long idClient);
	Boolean createClient(Client client);
	Boolean changeStatus();
	
	
}
