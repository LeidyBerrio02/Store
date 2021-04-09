package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.model.Client;
import com.store.demo.repository.Data;
import com.store.demo.repository.GenerateDate;

@Service
public class ClientServiceImp implements ClientService {

	@Autowired
	private OrderService orderService;

	@Override
	public Boolean createClient(Client client) {

		if (client != null) {
			Data.clientList.add(client);
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Client> listClients() {

		Data.client1.setIdClient(1L);
		Data.client1.setCc("12345");
		Data.client1.setName("Ana");
		Data.client1.setAddress("Cr 11# 14-08");
		Data.client1.setOrders(orderService.orders());
		if(Data.order1.getStatus()=="Delete") {
			bill();
		}
		
		Data.clientList.add(Data.client1);
		

		return Data.clientList;
	}
	
	@Override
	public void updateClients(Client client) {
		if (GenerateDate.validateDate(Data.order1, 5)) {
			Data.clientList.add(client);
			Data.orderList.add(Data.order1);
		}
	}
	
	@Override
	public Boolean changeStatus() {
		if (GenerateDate.validateDate(Data.order1, 12)) {
			Data.order1.setStatus("Delete");
			Data.orderList.add(Data.order1);
			return true;
		}
		return false;
	}
	
	public void bill() {
		double ret = Data.order1.getSubtotal();
		ret = ret * 0.10;
		Data.client1.setBill(ret);
	}

	@Override
	public Boolean updateClient(Client client) {
		Client clientArray = new Client();
		if	(client != null) {
			searchClient(client);
			clientArray.setIdClient(client.getIdClient());
			clientArray.setName(client.getName());
			clientArray.setCc(client.getCc());
			clientArray.setAddress(client.getAddress());
			clientArray.setOrders(client.getOrders());
			Data.clientList.add(clientArray);
			if(Data.order1.getStatus()=="Delete") {
				bill();
			}
			return true;
		}
		return false;
	}

	@Override
	public Long searchClient(Client client) {
		for(Client cli : Data.clientList) {
			if(cli.getIdClient()==client.getIdClient()) {
				return client.getIdClient();
			}
		}
		return null;
	}

}
