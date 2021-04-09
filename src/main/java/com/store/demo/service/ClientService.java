package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Client;

public interface ClientService {

	ArrayList<Client> listClients();
	Client updateClient(Client client);
	Boolean createClient(Client client);
	
	
}
