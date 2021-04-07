package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Client;

public interface ClientService {

	ArrayList<Client> listClients();
	Boolean create(Client client);
	
	
}
