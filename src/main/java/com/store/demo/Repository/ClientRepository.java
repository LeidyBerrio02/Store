package com.store.demo.Repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.store.demo.model.Client;

@Repository
public class ClientRepository {
	
	public ArrayList<Client> listClient(){

	ArrayList<Client> clientList = new ArrayList<Client>();
	//Client client[] = new Client[10];
	
	Client client1 = new Client(1L,"12345","Ana","Cr11# 14-08");
	Client client2 = new Client(2L,"54321","Juan","Cr12# 15-09");
	
	clientList.add(client1);
	clientList.add(client2);
	
	return clientList;
}
	
}
