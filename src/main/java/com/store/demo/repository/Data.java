package com.store.demo.repository;

import java.util.ArrayList;
import java.util.Date;
import com.store.demo.model.Client;
import com.store.demo.model.DetailOrder;
import com.store.demo.model.Invoice;
import com.store.demo.model.Order;
import com.store.demo.model.Product;

import org.springframework.stereotype.Repository;

@Repository

public class Data {

	public static ArrayList<Client> clientList = new ArrayList<Client>();
	public static ArrayList<Order> orderList = new ArrayList<Order>();
	public static ArrayList<Order> orderList2 = new ArrayList<Order>();
	public static ArrayList<Product> productList = new ArrayList<Product>();
	public static ArrayList<DetailOrder> detailList = new ArrayList<DetailOrder>();
	public static ArrayList<DetailOrder> detailList2 = new ArrayList<DetailOrder>();
	public static ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();

	public ArrayList<Client> listClient() {

		// Products List
		Product product1 = new Product();
		product1.setIdProduct(1l);
		product1.setNameProduct("TV");
		product1.setPrice(100000.0);
		product1.setQuantity(1);
		
		Product product2 = new Product();
		product2.setIdProduct(2l);
		product2.setNameProduct("Headphones");
		product2.setPrice(60000.0);
		product2.setQuantity(4);
		
		Product product3 = new Product();
		product3.setIdProduct(3l);
		product3.setNameProduct("Xiami redmi 8");
		product3.setPrice(200000.0);
		product3.setQuantity(2);
		
		Product product4 = new Product();
		product1.setIdProduct(1l);
		product1.setNameProduct("iPhone");
		product1.setPrice(55000.0);
		product1.setQuantity(3);
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);

		
		// Order list 1, client 1
		
		Order order1 = new Order();
		order1.setIdOrder(1L);
		order1.setOrderDate(new Date());
		order1.setSubtotal(20000);
		order1.setStatus("Pendient");
		

		/////////////////// detail
		DetailOrder detailOrder = new DetailOrder();
		detailOrder.setId(1l);
		detailOrder.setOrder(order1);
		detailOrder.setProduct(product1);
		//
		DetailOrder detailOrder1 = new DetailOrder();
		detailOrder1.setId(2l);
		detailOrder.setOrder(order1);
		detailOrder1.setTotal(1000.0);
		detailOrder1.setProduct(product2);
		
		detailList.add(detailOrder);
		detailList.add(detailOrder1);
		
		order1.setDetailOrder(detailList);
		orderList.add(order1);
		
		Client client1 = new Client();
		client1.setIdClient(1L);
		client1.setCc("12345");
		client1.setName("Ana");
		client1.setAddress("Cr 11# 14-08");
		client1.setOrders(orderList);
		
		clientList.add(client1);
		
		//////////////////////////////////////// detail////// other Order
		
		// Order list 1, client 1
		
		Order order2 = new Order();
		order2.setIdOrder(2L);
		order2.setOrderDate(new Date());
		order2.setSubtotal(80000);
		order2.setStatus("Cancel");
		
		///////////detail 
		
		DetailOrder detailOrder2 = new DetailOrder();
		detailOrder2.setId(3l);
		detailOrder2.setOrder(order2);
		detailOrder2.setProduct(product1);

		detailList2.add(detailOrder2);
		
		order2.setDetailOrder(detailList2);
		orderList2.add(order2);
		
		////////////detail


		Client client2 = new Client();
		client2.setIdClient(2l);
		client2.setCc("54321");
		client2.setName("Juan");
		client2.setAddress("Cr 24# 20-1");
		client2.setOrders(orderList2);
		
		clientList.add(client2);

		return clientList;
	}

}
