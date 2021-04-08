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

	public static Product product1 = new Product(1l,"TV",70000.0,4);
	public static Product product2 = new Product(2l,"Headphones",60000.0,3);
	public static Product product3 = new Product(3l,"Xiami redmi 8",20000.0,5);
	public static Product product4 = new Product(4l,"iPhone",30000.0,2);

	
	public ArrayList<Client> listClient() {

		/* Products List
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
		product4.setIdProduct(4l);
		product4.setNameProduct("iPhone");
		product4.setPrice(55000.0);
		product4.setQuantity(3);*/
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		productList.add(product4);

		
		// Order list 1, client 1
		
		Order order1 = new Order();
		order1.setIdOrder(1L);
		order1.setOrderDate(new Date());

		order1.setStatus("Active");
		

		/////////////////// detail
		DetailOrder detailOrder = new DetailOrder();
		detailOrder.setId(1l);
		detailOrder.setOrder(order1);
		detailOrder.setProduct(product1);
		detailOrder.setQuantityOrder(1);
		double total = 0;
		total = total + (product1.getPrice() * detailOrder.getQuantityOrder()) ;
		detailOrder.setTotal(total);
		
		//
		DetailOrder detailOrder1 = new DetailOrder();
		detailOrder1.setId(2l);
		detailOrder1.setOrder(order1);
		detailOrder1.setProduct(product4);
		detailOrder1.setQuantityOrder(2);
		total = total + (product4.getPrice() * detailOrder1.getQuantityOrder());
		detailOrder1.setTotal(total);
		
		detailList.add(detailOrder);
		detailList.add(detailOrder1);
		
		order1.setSubtotal((product1.getPrice() * detailOrder.getQuantityOrder())+ (product4.getPrice() * detailOrder1.getQuantityOrder()));
		order1.setDetailOrder(detailList);
		
		//invoice 
		Invoice invoice = new Invoice();
		invoice.setIdInvoice(1l);
		
		var iva  = order1.getSubtotal() * 0.19;
		invoice.setSubTotalIva(order1.getSubtotal()+ iva);
		
		if	(order1.getSubtotal() >= 100000) {
			invoice.setHomeValue(0);
		}else {
			invoice.setHomeValue(1000.0);
		}
		
		invoice.setTotal(total+ iva +invoice.getHomeValue());
		order1.setInvoice(invoice);
		
		//Add Order
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
		order2.setStatus("Active");
		
		///////////detail 
		
		DetailOrder detailOrder2 = new DetailOrder();
		detailOrder2.setId(3l);
		detailOrder2.setOrder(order2);
		detailOrder2.setProduct(product3);
		detailOrder2.setQuantityOrder(2);
		double total1 = 0;
		total1 = total1 + (product3.getPrice() * detailOrder2.getQuantityOrder());

		
		detailList2.add(detailOrder2);
		
		order2.setSubtotal(total1);
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
