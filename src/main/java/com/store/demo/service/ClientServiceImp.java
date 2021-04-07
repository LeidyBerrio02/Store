package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.model.Client;
import com.store.demo.repository.Data;

@Service
public class ClientServiceImp implements ClientService{

	@Autowired
	private Data clientRepository;
	
	@Override
	public ArrayList<Client> listClients() {
		// TODO Auto-generated method stub
		return clientRepository.listClient();
	}

	@Override
	public Boolean create(Client client) {
		if (client != null) {
			Data.clientList.add(client);
			return true;
		}
		return false;
	}

	
	
}
