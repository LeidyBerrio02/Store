package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.Repository.ClientRepository;
import com.store.demo.model.Client;

@Service
public class ClientServiceImp implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	ArrayList<Client> listClient = new ArrayList<Client>();
	
	@Override
	public ArrayList<Client> listClients() {
		// TODO Auto-generated method stub
		return clientRepository.listClient();
	}

	@Override
	public Boolean create(Client client) {
		if (client != null) {
			listClient.add(client);
			return true;
		}
		return false;
	}

	
	
}
