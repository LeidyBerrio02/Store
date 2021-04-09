package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Client;

public interface ClientService {

	ArrayList<Client> listClients();
	Boolean createClient(Client client);
	Boolean updateClient(Client client);
	Boolean changeStatus();
	Long searchClient(Client client);
	void updateClients(Client client);
	
	
}
