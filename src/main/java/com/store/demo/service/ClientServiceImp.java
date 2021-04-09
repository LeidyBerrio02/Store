package com.store.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.demo.model.Client;
import com.store.demo.repository.Data;

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

		Data.clientList.add(Data.client1);

		return Data.clientList;
	}

	@Override
	public void updateClient(Client client) {
		if (orderService.validateDate(Data.order1, 5)) {
			Data.clientList.add(client);
			Data.orderList.add(Data.order1);
		}
	}

	@Override
	public Boolean changeStatus() {
		if (orderService.validateDate(Data.order1, 12)) {
			Data.order1.setStatus("DELETE");
			Data.orderList.add(Data.order1);
			double ret = Data.order1.getSubtotal();
			ret = ret * 0.10;
			Data.client1.setBill(ret);
			return true;
		}
		return false;
	}

	@Override
	public Boolean update(Client client, Long idClient) {
		Long busqueda = (long) Data.clientList.indexOf(client);
		Client clientA = new Client();
		if	(client != null) {
			clientA.setIdClient(busqueda);
			clientA.setName(client.getName());
			clientA.setCc(client.getCc());
			clientA.setAddress(client.getAddress());
			clientA.setOrders(client.getOrders());
			Data.clientList.add(clientA);
			return true;
		}
		return false;
	}

}
