package com.store.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private Long idClient;
	
	private String cc;

	private String name;

	private String address;

	private List<Order> orders;
	
	//si el pedido se cancela se devuelve el 10% del valor del pedido
	private double bill;
	
	

	public Client(Long idClient, String cc, String name, String address) {
		super();
		this.idClient = idClient;
		this.cc = cc;
		this.name = name;
		this.address = address;
	}

	public Client() {
		super();
	}

	public Client(Long idClient, String cc, String name, String address, List<Order> orderList1) {
		super();
		this.idClient = idClient;
		this.cc = cc;
		this.name = name;
		this.address = address;
		this.orders = orderList1;
	}

	public Client(Long idClient, String cc, String name, String address, ArrayList<Order> orders, double bill) {
		super();
		this.idClient = idClient;
		this.cc = cc;
		this.name = name;
		this.address = address;
		this.orders = orders;
		this.bill = bill;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}



	public double getBill() {
		return bill;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}


}
