package com.store.demo.Repository;

import java.util.ArrayList;


import com.store.demo.model.Client;

public class ClientRepository {
	
	public static void main (String args[]) { 

	ArrayList<Client> client = new ArrayList<Client>();
	//Client client[] = new Client[10];
	
	Client client1 = new Client(1L,"12345","Ana","Cr11# 14-08");
	Client client2 = new Client(1L,"54321","Juan","Cr12# 15-09");
	
	client.add(client1);
	client.add(client2);
	
	System.out.println(client.toString());
	
	}
	
}
