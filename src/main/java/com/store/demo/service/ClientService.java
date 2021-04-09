package com.store.demo.service;

import java.util.ArrayList;

import com.store.demo.model.Client;
import com.store.demo.model.Order;

public interface ClientService {

	ArrayList<Client> listClients();
	void updateClient(Client client);
	Boolean createClient(Client client);
	void changeStatus();
	
	
}
