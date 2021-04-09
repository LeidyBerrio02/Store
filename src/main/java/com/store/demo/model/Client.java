package com.store.demo.model;

import java.util.List;

public class Client {

	private Long idClient;
	
	private String cc;

	private String name;

	private String address;

	private List<Order> orders;
	
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

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", cc=" + cc + ", name=" + name + ", address=" + address + ", orders="
				+ orders + "]";
	}
	
	

}
