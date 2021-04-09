package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.model.Client;
import com.store.demo.model.DetailOrder;
import com.store.demo.model.Order;
import com.store.demo.model.Product;
import com.store.demo.repository.Data;

@Service
public class ClientServiceImp implements ClientService{

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
	public ArrayList<Client> listClients(){

		Client client1 = new Client();
		client1.setIdClient(1L);
		client1.setCc("12345");
		client1.setName("Ana");
		client1.setAddress("Cr 11# 14-08");
		client1.setOrders(orderService.orders());
		
		Data.clientList.add(client1);		
		
		return Data.clientList;
	}
	
	public Boolean updateAllproducs(Client client, Order order) {
		if	(orderService.validateDate(order, 5)) {
			
			Data.clientList.equals(client);
			
			return true;
		}
		
		return false;
	}


	@Override
	public void updateClient(Client client) {
		if(orderService.validateDate(Data.order1,5)) {
		Data.clientList.add(client);
		Data.orderList.add(Data.order1);
		}
	}
	
	@Override
	public void changeStatus() {
		if(orderService.validateDate(Data.order1, 12)) {
		Data.order1.setStatus("DELETE");
		Data.orderList.add(Data.order1);
		}
	}
	
	
}
